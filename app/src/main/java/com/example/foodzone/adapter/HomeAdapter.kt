package com.example.foodzone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodzone.R
import com.example.foodzone.model.RestaurantData

class HomeAdapter(val context: Context,var itemList:ArrayList<RestaurantData>):RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {


    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var imgRest=itemView.findViewById<ImageView>(R.id.imgRest)
        var restName=itemView.findViewById<TextView>(R.id.tvNameRest)
        var tvCost=itemView.findViewById<TextView>(R.id.tvCost)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.home_rv_single_row,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.restName.text=itemList[position].restName
        holder.tvCost.text= itemList[position].cost.toString()


    }

    override fun getItemCount(): Int {
          return itemList.size
    }

}