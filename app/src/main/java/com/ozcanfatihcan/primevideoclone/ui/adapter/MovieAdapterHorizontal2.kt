package com.ozcanfatihcan.primevideoclone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozcanfatihcan.primevideoclone.data.entity.Movie
import com.ozcanfatihcan.primevideoclone.databinding.CardHorizontalDesign2Binding

class MovieAdapterHorizontal2(var mContext: Context, var movieList: List<Movie>): RecyclerView.Adapter<MovieAdapterHorizontal2.CardDesignHolder>() {

    inner class CardDesignHolder(var design: CardHorizontalDesign2Binding): RecyclerView.ViewHolder(design.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val design= CardHorizontalDesign2Binding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val movie=movieList.get(position)
        val t=holder.design

        t.ivMovie2.setImageResource(mContext.resources.getIdentifier(movie.movie_picture,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}