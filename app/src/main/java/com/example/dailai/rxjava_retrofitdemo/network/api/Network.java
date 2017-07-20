// (c)2016 Flipboard Inc, All Rights Reserved.

package com.example.dailai.rxjava_retrofitdemo.network.api;


import com.example.dailai.rxjava_retrofitdemo.network.NetApi;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static NetApi netApi;

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new StethoInterceptor()).build();
    private static Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
//    private static CallAdapter.Factory rxJavaCallAdapterFactory =RxJavaCallAdapterFactory.create();





    public static NetApi getZhuangbiApi() {

        if (netApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("http://192.168.0.212:81/")//调用接口的
                    .addConverterFactory(gsonConverterFactory)
//                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            netApi = retrofit.create(NetApi.class);
        }
        return netApi;
    }


}
