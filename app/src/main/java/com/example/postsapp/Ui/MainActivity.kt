package com.example.postsapp.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.postsapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Lateint var Posts view Model:Postsview
        Lateint var PostsviewModelFactory Postsview Model Factory

        Var PostsRespository=Post Repository()
        PostViewModel.Factory=PostViewModelFactory(postsRespository)
        Posts viw Model=View Model Provider(owner:this,postsView ModelFactory)
        get.(postsviewModel::class.java)
    }
}

PostsViewModel.get Posts()
        postViewModel.post liveData.observe(owner:this,Observer{
    postsList->
    Toast.snakeTextCbaseContext,"&{
    error-7Toast.makkrText (base context, error,Toast.LRNGTH-Long).show()
})
