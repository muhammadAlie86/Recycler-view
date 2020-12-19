package com.tutorial.recyclerviewkotlin

package com.alie.alumni.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.alie.alumni.R
import com.alie.alumni.model.Kelas

class ListKelasAdapter : RecyclerView.Adapter<ListKelasAdapter.Companion.ListKelasHolder>,Filterable
{
    private  var context: Context
    private  var listKelas: ArrayList<Kelas>
    private  var listFilter : ArrayList<Kelas>

    constructor(context: Context, list: ArrayList<Kelas>) : super()// secondary constructor
    {
        this.listKelas = list
        this.listFilter = list
        this.context = context
    }
    companion object // static class
    {
        class ListKelasHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        {
            var tvName: TextView
            var imgList: ImageView
            var itemKelas : LinearLayout

            init
            {
                itemKelas = itemView.findViewById(R.id.kelasItem) as LinearLayout
                tvName = itemView.findViewById(R.id.nameList) as TextView
                imgList = itemView.findViewById(R.id.imageList) as ImageView
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListKelasHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.roll_item, parent, false)
        return ListKelasHolder(view)
    }
    override fun getItemCount() = listFilter.size

    override fun onBindViewHolder(holder: ListKelasHolder, position: Int)
    {
        val listKelas = listFilter[position]

        holder.tvName.text = listKelas.name
        holder.imgList.setImageResource(listKelas.photo)

        val anim  = AnimationUtils.loadAnimation(context,R.anim.anim_from_right) as Animation
        holder.imgList.animation = anim
        holder.tvName.animation = anim

        holder.itemKelas.setOnClickListener(object : View.OnClickListener
        {
            override fun onClick(v: View?) {
            }
        })
    }

    override fun getFilter(): Filter // filter name
    {

        return object : Filter()
        {
            override fun performFiltering(constraint: CharSequence?): FilterResults
            {

                val charString = constraint.toString()
                if (charString.isEmpty())
                {
                    listFilter = listKelas
                }
                else
                {
                    val filterList: ArrayList<Kelas> = arrayListOf()
                    val searchChr : String = constraint.toString().toLowerCase()

                    for (a: Kelas in listKelas)
                    {

                        if (a.name.toLowerCase().contains(searchChr)) {
                            filterList.add(a)
                        }
                    }
                    listFilter = filterList
                }

                val filterResult: FilterResults = FilterResults()
                filterResult.values = listFilter
                return filterResult
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?)
            {

                listFilter = results!!.values as ArrayList<Kelas>
                notifyDataSetChanged()//notify data setelah berubah

            }

        }
    }

}

