package com.example.task_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("users?page=2")
    Call<JSONResponse> getJSON();
}
