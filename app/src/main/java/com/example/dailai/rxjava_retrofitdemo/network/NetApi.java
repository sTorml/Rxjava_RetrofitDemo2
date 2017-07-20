package com.example.dailai.rxjava_retrofitdemo.network;


import com.example.dailai.rxjava_retrofitdemo.network.netModule.InsureResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;

/**
 * Created by dailai on 2017/7/6.
 */

public interface NetApi {

//    @Multipart
//    @POST("api/Product/GetData")
//    Observable<HomeResponse> getHomePageData(@Body HomePageSendData user) ;
    @Headers("contentType: application/xml charset=UTF-8")
    @FormUrlEncoded
    @POST("api/Product/GetData")
    Observable<InsureResponse> getHomePageData(@Field("json") String json, @Field("whereJson") String wherejson,
                                               @Field("operateType") int operateType, @Field("functionType") int functionType,
                                               @Field("datatype") int datatype);


}
