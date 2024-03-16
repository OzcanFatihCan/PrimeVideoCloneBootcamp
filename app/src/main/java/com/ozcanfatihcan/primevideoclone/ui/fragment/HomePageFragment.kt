package com.ozcanfatihcan.primevideoclone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ozcanfatihcan.primevideoclone.R
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.databinding.FragmentHomePageBinding
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterHorizontal
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterHorizontal2
import com.ozcanfatihcan.primevideoclone.ui.adapter.MovieAdapterVertical
import com.ozcanfatihcan.primevideoclone.ui.viewModel.HomePageViewModel


class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    private lateinit var viewModel:HomePageViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home_page,container,false)
        binding.homeFragmentObject=this

        viewModel.popularMovieList.observe(viewLifecycleOwner){
            binding.movieAdapterHorizontal= MovieAdapterHorizontal(requireContext(),it)
        }

        viewModel.subtitleMovieList.observe(viewLifecycleOwner){
            binding.movieAdapterHorizontal2= MovieAdapterHorizontal2(requireContext(),it)
        }

        viewModel.originalMovieList.observe(viewLifecycleOwner){
            binding.movieAdapterVertical=MovieAdapterVertical(requireContext(),it)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:HomePageViewModel by viewModels()
        viewModel=tempViewModel
    }
}