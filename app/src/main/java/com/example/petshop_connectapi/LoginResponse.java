package com.example.petshop_connectapi;

public class LoginResponse {
    private String message;
    private String accessToken;
    private String refreshToken;

    public String getMessage() {
        return message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
