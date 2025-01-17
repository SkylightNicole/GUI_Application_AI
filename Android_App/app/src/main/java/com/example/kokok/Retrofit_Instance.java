package com.example.kokok;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_Instance {
    private static final String Base_Url = "https://bright-donkey-exact.ngrok-free.app/";
    private static Retrofit retrofit = null;
    public static ApiService getApiService()
    {
        if (retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiService.class);
    }
}
