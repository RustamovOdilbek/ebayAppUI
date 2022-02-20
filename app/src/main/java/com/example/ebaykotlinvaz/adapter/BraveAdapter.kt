package com.example.ebaykotlinvaz.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlinvaz.FirstListner
import com.example.ebaykotlinvaz.R
import com.example.ebaykotlinvaz.model.Brave

class BraveAdapter(var context: Context, var items: ArrayList<Brave>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), FirstListner{
    lateinit var layout: LinearLayout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_brave, parent, false)

       layout = view.findViewById(R.id.ll_brave)

        return BraveViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = items[position]
        if (holder is BraveViewHolder){
            var iv_brave_profile = holder.iv_brave_profile
            var tv_brave_title = holder.tv_brave_title

            iv_brave_profile.setImageResource(item.iv_brave_profile)
            tv_brave_title.text = item.tv_brave_title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class BraveViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_brave_profile: ImageView
        var tv_brave_title: TextView

        init {
            iv_brave_profile = view.findViewById(R.id.iv_brave_profile)
            tv_brave_title = view.findViewById(R.id.tv_brave_title)
        }
    }

    override fun onFirstSend(params: ViewGroup.LayoutParams) {
        layout.layoutParams = params
    }
}