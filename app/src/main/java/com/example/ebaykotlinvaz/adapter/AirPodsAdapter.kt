package com.example.ebaykotlinvaz.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebaykotlinvaz.R
import com.example.ebaykotlinvaz.model.AirPods

class AirPodsAdapter(var context: Context, var items: ArrayList<AirPods>)
    :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_headset, parent, false)

        return AirPodsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
     var item = items[position]
     if (holder is AirPodsViewHolder){
         var iv_airpods = holder.iv_airpods
         var tv_airpods_name = holder.tv_airpods_name
         var tv_airpods_price = holder.tv_airpods_price
         var tv_airpods_new_price = holder.tv_airpods_new_price

         iv_airpods.setImageResource(item.iv_air_pods)
         tv_airpods_name.text = item.tv_airpods_name
         tv_airpods_price.text = item.tv_air_pods_price
         tv_airpods_new_price.text = item.tv_air_pods_new_price
     }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class AirPodsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_airpods: ImageView
        var tv_airpods_name: TextView
        var tv_airpods_price: TextView
        var tv_airpods_new_price: TextView

        init {
            iv_airpods = view.findViewById(R.id.iv_air_pods)
            tv_airpods_name = view.findViewById(R.id.tv_air_pods_name)
            tv_airpods_price = view.findViewById(R.id.tv_air_pods_price)
            tv_airpods_new_price = view.findViewById(R.id.tv_air_pods_price_new)
        }
    }
}