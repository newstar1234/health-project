package com.example.health_back.config;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.health_back.filter.JwtAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
  
    @Bean
    protected SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
      httpSecurity
          .cors(cors -> cors
                .configurationSource(corsConfigrationSource())
          )
          .csrf(CsrfConfigurer::disable)
          .httpBasic(HttpBasicConfigurer::disable)
          .sessionManagement(sesstionManagement -> sesstionManagement
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
          )   
          .authorizeHttpRequests(request -> request
                .requestMatchers("/", "/api/v1/auth/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/api/v1/board/**", "/api/v1/user/*").permitAll()
                .anyRequest().authenticated()
          )
          .exceptionHandling(exceptionHandling -> exceptionHandling
                .authenticationEntryPoint(new FailedAutheicationEntryPoint())
          )
          .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
      return httpSecurity.build();
    }
    @Bean
    protected CorsConfigurationSource corsConfigrationSource() {
      CorsConfiguration configuration = new CorsConfiguration();
      configuration.addAllowedOrigin("*");
      configuration.addAllowedMethod("*");
      configuration.addAllowedHeader("*");
  
      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      source.registerCorsConfiguration("/**", configuration);
  
      return source;
    }
  
  }
  
  class FailedAutheicationEntryPoint implements AuthenticationEntryPoint {
  
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
        throws IOException, ServletException {
  
          response.setContentType("application/json");
          response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
          response.getWriter().write("{ \"code\": \"AF\", \"message\": \"Authorization Failed.\" }");
  
    }
    
  }
