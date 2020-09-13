package com.example.postsapp.viewModel

class postViewModel {
    var postsLiveData= MutableLiveData<List<Ost>>()
    var postsFailedLiveData= MutableLiveData<String>()

    fun getPosts(){
        ViewModelScope.Launch{
         val response = postsRepository.getPosts()
          if(response.isSuccessful){
                postsLiveData.postValue(response.body)
          }
            else{
              postsFailedLiveData.postValue(response.body()?.string))
          }
        }
    }
}