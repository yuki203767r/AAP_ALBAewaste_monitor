package org.tensorflow.lite.examples.objectdetection.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class AppConfig {

//    public static String BASE_URL = "http://10.0.2.2:5000/";
public static String BASE_URL = "https://kotlin-mobile-aap.herokuapp.com/";

    public static Retrofit getRetrofit() {

        return new Retrofit.Builder()
            .baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }
}
