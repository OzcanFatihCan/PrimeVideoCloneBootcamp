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


        


        return binding.root
    }
}