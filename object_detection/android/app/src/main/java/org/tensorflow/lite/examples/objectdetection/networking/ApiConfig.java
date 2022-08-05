package org.tensorflow.lite.examples.objectdetection.networking;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;


public interface ApiConfig {

    @Multipart
    @POST("recog")
    Call<ServerResponse> upload(
            @Part MultipartBody.Part part
    );
}