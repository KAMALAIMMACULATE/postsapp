package com.example.postsapp.Api

Object ApiClient{
    var client=OkhttpClient.Boildern () .build()
    var retrofit=Retrofit.Builder().baseurl()
        .addConverter Factory()Gson.converterFactory.create()
        .Factory.create()
        .build()

    fun <T>BuildService(Service:class<T>):T{
        return retrofit.create(service)
    }
}