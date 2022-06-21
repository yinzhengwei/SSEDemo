package com.sse.ssedemo;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Create by yinzhengwei on 2021/7/8
 * todo:
 */
public class OkHttpUtle {

    public static String TAG = "OkHttpUtle";

    public static void testOkhttpGet() {
////        String url = "http://api.k780.com/?app=weather.history";
//        String url = "http://roadexam.58v5.cn/roadExam/ykx/brandList";
        String url = "http://10.252.74.88:8001/roadExam/over";
//        Request request = new okhttp3.Request.Builder().url(url).get().addHeader(
//                "token",
//                "eyJraWQiOiIxOTM2ODAwMDYiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJVQ1RTIiwiYXVkIjoicm9hZC0iLCJpYXQiOjE2MjE1OTQ2NjksImV4cCI6MTY1MjY5ODY2OSwic3ViIjoiMjI5MzE2YjEyYjBlMDQ5ZTdkZGUzOTg1M2RlOTFlZWMifQ.IDLKnPiKa0VCJ_3716ze2PYY7EQI1t9lDmbZT7tRgGpTQm9gMqGc3auHnhwz50KEtkr7-5ANV5lhpZtK0852DPxvxxFi2GESXpMZM0tHXNseSnvYxatAt8OGwAyCBFvH-mOjiwgNH04zvkK8hSQqLDo4MDj10ggsjG1N7SrmmDHbLRMWY-8aXY74COu9TZ6gtYhIZEQKcmhZa_LhQSk_l54DEXmqQSOgQkzSiHvziJSbI3kWPkALAqslNI3jeIwB6dDmnGZlU3hvHzRNbZqnjyR7JvtjtllO1rd3Xmba0Do9Md9atqhBuSKJgqN00BYNbO5PE4_jRTSDHICW7vUg6g"
//        ).build();
//        OkHttpClient okHttpClient = new OkHttpClient();


//        String url = "http://api.k780.com/?app=weather.history";
//        String json = "{\"format\":\"json\",\"weaid\":1,\"date\":\"2018-08-13\",\"appkey\":\"10003\",\"sign\":\"b59bc3ef6191eb9f747dd4e83c99f2a4\"}";
        String json = "";

        OkHttpClient okHttpClient = new OkHttpClient();
//        RequestBody body = RequestBody.create(MediaType.parse("text/event-stream;application/json;charset=utf-8"), json);
        Request.Builder builder = new Request.Builder().get().url(url);
        builder.addHeader("Content-Type", "text/event-stream");
        Request request = builder.build();


        final Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
//                Message message = Message.obtain();
//                message.what = 0;
//                message.obj = e.getMessage();
//                mHandler.sendMessage(message);
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, okhttp3.Response response) throws IOException {
//                Message message = Message.obtain();
//                message.what = 1;
//                message.obj = response.body().string();//string不能调用两次 被调用一次就关闭了，这里调用两次会报异常
//                mHandler.sendMessage(message);
                Log.d(TAG, "response: " + response.body().string());
            }
        });

    }
}
