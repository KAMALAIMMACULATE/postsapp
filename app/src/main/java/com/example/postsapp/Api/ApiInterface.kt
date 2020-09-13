package com.example.postsapp.Api

interface ApiInterface {
    @GET (raise:POSTS)
    Suspend fun get posts():Responge.<List<post>>
}