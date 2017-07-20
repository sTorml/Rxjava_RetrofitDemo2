package com.example.dailai.rxjava_retrofitdemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.dailai.rxjava_retrofitdemo.R;
import com.example.dailai.rxjava_retrofitdemo.network.api.Network;
import com.example.dailai.rxjava_retrofitdemo.network.netModule.InsureResponse;
import com.google.gson.Gson;

import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.text1)
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.text1)
    public void onViewClicked() {

//        String json={"orderString":"createTime","pageSize":"10","pageIndex":"1"}"
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("orderString", "createTime");
        hashMap.put("pageSize", "10");
        hashMap.put("pageIndex", "1");
        Gson gson = new Gson();
        String json = gson.toJson(hashMap);
//        whereJson ={"productType":"1","id":"67E75B65-EA9D-4FA4-8F7B-B724C7B0A9FD","type":"2","userId":"7ed7ea27-adfa-47b3-b939-1db3b5808e36","productName":""}
        HashMap<String, String> wheremap = new HashMap<>();
        wheremap.put("productType", "1");
        wheremap.put("id", "67E75B65-EA9D-4FA4-8F7B-B724C7B0A9FD");
        wheremap.put("type", "2");
        wheremap.put("userId", "7ed7ea27-adfa-47b3-b939-1db3b5808e36");
        wheremap.put("productName", "");
        String wherejson = gson.toJson(wheremap);
        Network.getZhuangbiApi().getHomePageData(json, wherejson, 1, 24, 1).
                subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<InsureResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(InsureResponse value) {
                text1.setText(value.toString());


            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });


    }
}
