package nemo.kmj.com.a17appjam;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitServices {
    @POST("/sendData")
    @FormUrlEncoded
    Call<Data> sendData(@Field("hour") int hour);

}
