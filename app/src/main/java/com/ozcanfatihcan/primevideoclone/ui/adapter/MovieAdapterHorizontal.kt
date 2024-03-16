package com.ozcanfatihcan.primevideoclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ozcanfatihcan.primevideoclone.R
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.databinding.CardHorizontalDesignBinding

class MovieAdapterHorizontal(var mContext:Context, var movieList: List<Movie>):RecyclerView.Adapter<MovieAdapterHorizontal.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardHorizontalDesignBinding):RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding:CardHorizontalDesignBinding=DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_horizontal_design ,parent,false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
       val movie=movieList.get(position)
        val t=holder.design

        t.ivMovie.setImageResource(mContext.resources.getIdentifier(movie.movie_picture,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
       return movieList.size
    }
}