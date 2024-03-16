package com.ozcanfatihcan.primevideoclone.data.repo

import com.ozcanfatihcan.primevideoclone.data.datasource.HomePageDataSource
import com.ozcanfatihcan.primevideoclone.data.entity.Movie

class HomePageRepository {
    var dataSource=HomePageDataSource()

    suspend fun popularMovieData():List<Movie> = dataSource.popularMovieData()
    suspend fun subtitleMovieData():List<Movie> = dataSource.subtitleMovieData()
    suspend fun originalMovieData():List<Movie> = dataSource.originalMovieData()


}