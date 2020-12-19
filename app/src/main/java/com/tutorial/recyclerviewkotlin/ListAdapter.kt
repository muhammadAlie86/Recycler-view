package com.tutorial.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions

class ListAdapter (private val list : ArrayList <Cafe>) : RecyclerView.Adapter<ListAdapter.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return MyHolder(view)
    }
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val listCafe = list[position]

        holder.tvName.text = listCafe.name
        holder.tvDesc.text = listCafe.desc

        Glide.with(holder.itemView.context)
            .load(listCafe.image)
            .apply(RequestOptions().override(55,55))
            .into(holder.img)
    }


    override fun getItemCount() = list.size

    inner class MyHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        var tvName : TextView = itemView.findViewById(R.id.nameList)
        var tvDesc : TextView = itemView.findViewById(R.id.descriptionList)
        var img : ImageView = itemView.findViewById(R.id.imageList)
    }
}