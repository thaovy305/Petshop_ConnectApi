package com.example.petshop_connectapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest request);
}
