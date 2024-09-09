package com.example.health_back.common;

public interface ResponseMessage {

     // HTTP Status 200
     public static final String SUCCESS = "Success";

     // HTTP Status 400
     String VALIDATION_FAILED = "Validation failed";
     String DUPLICATION_EMAIL = "Duplication email";
     String DUPLICATION_NICKNAME = "Duplication nickname";
     String NO_EXISTED_USER = "No existed user";
     String NO_EXISTED_BOARD = "No existed board";
   
     // HTTP Status 401
     String SIGN_IN_FAILED = "Sign in failed. Login information missmatch";
     String AUTHORIZATION_FAILED = "Authorization failed";
     
     // HTTP Status 403
     String NO_PERMISSION = "Do not have permission";
 
     // HTTP Status 500
     String DATABASE_ERROR = "Datebase Error";

}
