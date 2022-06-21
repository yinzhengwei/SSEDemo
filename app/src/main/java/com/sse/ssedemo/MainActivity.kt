package com.sse.ssedemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.internal.sse.RealEventSource
import okhttp3.sse.EventSource
import okhttp3.sse.EventSourceListener
import java.net.Proxy
import java.util.concurrent.TimeUnit

/**
 * 官网源码
 * https://github.com/square/okhttp/tree/master/okhttp-sse
 *
 * 其他Demo
 * https://github.com/heremaps/oksse
 *
 * 功能介绍
 * https://blog.csdn.net/Mind_programmonkey/article/details/110097515?utm_medium=distribute.pc_relevant.none-task-blog-baidujs_title-0&spm=1001.2101.3001.4242
 */
class MainActivity : AppCompatActivity() {

    private val mTimeoutTimed: Long = 10000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        OkHttpUtle.testOkhttpGet()


//        val builder =
//            Request.Builder().url("http://10.252.74.88:8001/roadExam/login/check?deviceId=1111")
        //http://roadexam.58v5.cn/roadExam/ykx/brandList
//            Request.Builder().url("http://roadexam.58v5.cn/roadExam/ykx/brandList")






//        val body = RequestBody.create("text/event-stream;".toMediaTypeOrNull(), "");
//
//        val request = Request.Builder().url("http://10.252.74.88:8001/roadExam/login/check?deviceId=1111")
//            .get()//.method("get",body)
//            .addHeader(
//                "token",
//                "eyJraWQiOiIxOTM2ODAwMDYiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJVQ1RTIiwiYXVkIjoicm9hZC0iLCJpYXQiOjE2MjE1OTQ2NjksImV4cCI6MTY1MjY5ODY2OSwic3ViIjoiMjI5MzE2YjEyYjBlMDQ5ZTdkZGUzOTg1M2RlOTFlZWMifQ.IDLKnPiKa0VCJ_3716ze2PYY7EQI1t9lDmbZT7tRgGpTQm9gMqGc3auHnhwz50KEtkr7-5ANV5lhpZtK0852DPxvxxFi2GESXpMZM0tHXNseSnvYxatAt8OGwAyCBFvH-mOjiwgNH04zvkK8hSQqLDo4MDj10ggsjG1N7SrmmDHbLRMWY-8aXY74COu9TZ6gtYhIZEQKcmhZa_LhQSk_l54DEXmqQSOgQkzSiHvziJSbI3kWPkALAqslNI3jeIwB6dDmnGZlU3hvHzRNbZqnjyR7JvtjtllO1rd3Xmba0Do9Md9atqhBuSKJgqN00BYNbO5PE4_jRTSDHICW7vUg6g"
//            ).addHeader("Content-Type", "text/event-stream")
//
//
//
//        val realEventSource = RealEventSource(request.build(), object : EventSourceListener() {
//            override fun onClosed(eventSource: EventSource) {
//                //super.onClosed(eventSource)
//            }
//
//            override fun onEvent(
//                eventSource: EventSource,
//                id: String?,
//                type: String?,
//                data: String
//            ) {
//                //super.onEvent(eventSource, id, type, data)
//                Log.d("realEventSource", "${eventSource.request().url} $id  $type   $data")
//            }
//
//            override fun onFailure(eventSource: EventSource, t: Throwable?, response: Response?) {
//                //super.onFailure(eventSource, t, response)
//            }
//
//            override fun onOpen(eventSource: EventSource, response: Response) {
//                //super.onOpen(eventSource, response)
//            }
//        })
//        val okHttpClient = OkHttpClient.Builder()
//
//        okHttpClient.retryOnConnectionFailure(true)
//            //.addInterceptor(mHeaderInterceptors())
//            //.addInterceptor(new sReplaceUrlInterceptor())
//            .connectTimeout(mTimeoutTimed, TimeUnit.MILLISECONDS)
//            .readTimeout(mTimeoutTimed, TimeUnit.MILLISECONDS)
//            .writeTimeout(mTimeoutTimed, TimeUnit.MILLISECONDS)
//
//
//        //if (isDebug) {
//        //测试地址 打印log
//        //    mBuilder.addInterceptor(new sLoggingInterceptor());
//        //} else {
//        //线上环境下，如果当前网络环境是代理模式，则拒绝请求
//        okHttpClient.proxy(Proxy.NO_PROXY)
//        //}
//        realEventSource.connect(okHttpClient.build())


    }

}
