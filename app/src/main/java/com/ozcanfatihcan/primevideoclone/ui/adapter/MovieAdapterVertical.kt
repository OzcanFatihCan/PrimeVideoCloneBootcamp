package com.ozcanfatihcan.primevideoclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.databinding.CardVerticalDesignBinding

class MovieAdapterVertical(var mContext: Context, var movieList: List<Movie>):RecyclerView.Adapter<MovieAdapterVertical.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardVerticalDesignBinding): RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design= CardVerticalDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie=movieList.get(position)
        val t=holder.design

        t.ivTvSeries.setImageResource(mContext.resources.getIdentifier(movie.movie_picture,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}