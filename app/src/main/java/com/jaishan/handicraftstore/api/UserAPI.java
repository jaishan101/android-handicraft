package com.jaishan.handicraftstore.api;

import com.jaishan.handicraftstore.model.User;
import com.jaishan.handicraftstore.server_response.SignUpResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserAPI {
    @POST("users/signup")
    Call<SignUpResponse> registerUser(@Body User users);

    @FormUrlEncoded
    @POST("users/login")
    Call<SignUpResponse> checkUser(@Field("phone") String number, @Field("password") String password);
}
