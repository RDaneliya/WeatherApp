package com.example.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apixu {
    @GET("current.json?key=ae129e848cf74559a8d95151191201")
    Call<Answer> getCity(@Query("q") String city);
}
