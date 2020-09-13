package com.example.postsapp.viewModel

class postViewModelFactory {
    (val postsRepository: PostRepository) : ViewModelProvider.Factory{
        override fun <T> : VeiwModel?> create(modelClass: Class<T>): T{
            if(modelClass.isAssignableForm(postsViewModelFactory:: class.java)){
                return postsViewModelFactory(postsRepository) as T
            }
            throw IllegalArgumentException("Unknown viewmodel class")
        }
    }
}