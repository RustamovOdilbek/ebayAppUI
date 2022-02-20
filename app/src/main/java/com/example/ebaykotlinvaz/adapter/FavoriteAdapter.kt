package com.example.ebaykotlinvaz.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlinvaz.model.Favorite
import com.example.ebaykotlinvaz.R

class FavoriteAdapter(var context: Context, var items: ArrayList<Favorite>):
     RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is FavoriteViewHolder){
            var tv_title = holder.tv_title
            var iv_image = holder.iv_image

            tv_title.text = item.tv_title
            iv_image.setImageResource(item.iv_image)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tv_title: TextView
        var iv_image: ImageView

        init {
            tv_title = view.findViewById(R.id.tv_title)
            iv_image = view.findViewById(R.id.iv_image)
        }
    }

}