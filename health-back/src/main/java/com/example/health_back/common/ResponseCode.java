package com.example.health_back.common;

public interface ResponseCode {
    
    // HTTP Status 200
    public static final String SUCCESS = "SU";

    // HTTP Status 400
    String VALIDATION_FAILED = "VF";
    String DUPLICATION_EMAIL = "DE";
    String DUPLICATION_NICKNAME = "DN";
    String NO_EXISTED_USER = "NU";
    String NO_EXISTED_BOARD = "NB";
  
    // HTTP Status 401
    String SIGN_IN_FAILED = "SF";
    String AUTHORIZATION_FAILED = "AF";
    
    // HTTP Status 403
    String NO_PERMISSION = "NP";

    // HTTP Status 500
    String DATABASE_ERROR = "DBE";

}
