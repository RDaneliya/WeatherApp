package com.example.weather;

import com.google.gson.annotations.Expose;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance;
    private static final String BASE_URL = "http://api.apixu.com/v1/";
    private Retrofit mRetofit;


    private NetworkService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor); //Объявление HttpLoggingInterceptor

        mRetofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    } //Инициализация Retrofit

    public static NetworkService getInstance() {
        if (mInstance == null)
            mInstance = new NetworkService();

        return mInstance;
    }//Шаблон проектирования "одиночка"

    public Apixu getApixu() {
        return mRetofit.create(Apixu.class);
    }
}
