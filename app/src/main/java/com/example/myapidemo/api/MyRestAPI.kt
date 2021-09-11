package com.example.myapidemo.api

import com.example.myapidemo.model.MessageRespond
import com.example.myapidemo.model.StudentRespond
import retrofit2.Call
import retrofit2.http.*

interface MyRestAPI {
    companion object{
        val BASE_URL:String = "http://demo.onmyfinger.com/"
    }

    @GET("home/getall")
    fun getAll(): Call <List<StudentRespond>>

    @GET("home/getbyid")
    fun getById(@Query("id")id:String): Call <StudentRespond>

    @POST("home/add")
    @FormUrlEncoded
    fun add(
        @Field("id") id:String,
        @Field("name") name:String,
        @Field("programme") programme:String,
        @Field("img") img:String): Call <MessageRespond>
}