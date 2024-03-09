package com.ozcanfatihcan.primevideoclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.databinding.FragmentHomePageBinding
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterHorizontal
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterHorizontal2
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterVertical


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomePageBinding.inflate(inflater,container,false)

        binding.rvPopular.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val movieList=ArrayList<Movie>()
        val movie1=Movie("1","Succession","succession")
        val movie2=Movie("2","John Wick 4","john_wick")
        val movie3=Movie("3","Fast & Furious 10","fast_furious")
        val movie4=Movie("4","The Northman","the_northman")
        val movie5=Movie("5","The Bigbang Theory","bigbang_theory")
        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)

        val movieAdapter=MovieAdapterHorizontal(requireContext(),movieList)
        binding.rvPopular.adapter=movieAdapter

        binding.rvSubtitle.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movieList2=ArrayList<Movie>()
        val series1=Movie("6","The office","the_office")
        val series2=Movie("7","Lord of the Rings","lord_of_the_rings")
        val series3=Movie("8","Chernobyl","chernobyl")
        val series4=Movie("9","Wheel of Time","wheel_of_time")
        val series5=Movie("10","The Boys","the_boys")
        movieList2.add(series1)
        movieList2.add(series2)
        movieList2.add(series3)
        movieList2.add(series4)
        movieList2.add(series5)
        val movieAdapter2=MovieAdapterHorizontal2(requireContext(),movieList2)
        binding.rvSubtitle.adapter=movieAdapter2

        binding.rvOriginal.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val movieList3=ArrayList<Movie>()
        val vertSeries1=Movie("11","Best Hospital of Galaxy","best_hospital_of_galaxy")
        val vertSeries2=Movie("12","Lord of the Rings","lord_of_rings_vertical")
        val vertSeries3=Movie("13","Giannis","giannis")
        val vertSeries4=Movie("11","Düğüm","dugum")
        val vertSeries5=Movie("11","Ricky stanicky","ricky_stanicky")
        movieList3.add(vertSeries1)
        movieList3.add(vertSeries2)
        movieList3.add(vertSeries3)
        movieList3.add(vertSeries4)
        movieList3.add(vertSeries5)
        val movieAdapter3=MovieAdapterVertical(requireContext(),movieList3)
        binding.rvOriginal.adapter=movieAdapter3



        return binding.root
    }
}