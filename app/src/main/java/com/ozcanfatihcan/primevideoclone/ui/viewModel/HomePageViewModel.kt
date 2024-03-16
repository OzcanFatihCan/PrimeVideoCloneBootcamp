package com.ozcanfatihcan.primevideoclone.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.data.repo.HomePageRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomePageViewModel:ViewModel() {
    private var homeRepository=HomePageRepository()
    val popularMovieList=MutableLiveData<List<Movie>>()
    val subtitleMovieList=MutableLiveData<List<Movie>>()
    val originalMovieList=MutableLiveData<List<Movie>>()

    init {
        popularMovieGet()
        subtitleMovieGet()
        originalMovieGet()
    }

    fun popularMovieGet(){
        CoroutineScope(Dispatchers.Main).launch {
            popularMovieList.value=homeRepository.popularMovieData()
        }
    }
    fun subtitleMovieGet(){
        CoroutineScope(Dispatchers.Main).launch {
            subtitleMovieList.value=homeRepository.subtitleMovieData()
        }
    }
    fun originalMovieGet(){
        CoroutineScope(Dispatchers.Main).launch {
            originalMovieList.value=homeRepository.originalMovieData()
        }
    }
}