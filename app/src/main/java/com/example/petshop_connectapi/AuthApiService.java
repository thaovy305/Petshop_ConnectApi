package com.example.petshop_connectapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface AuthApiService {
    @Headers("Content-Type: application/json")
    @POST("api/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
