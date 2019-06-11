package com.example.adapterapp

import android.app.Person
import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_layout.view.*


class SimpleAdapter(
    val context: Context,
    val listData: List<SimpleDataClass>): RecyclerView.Adapter<SimpleAdapter.MySimpleHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySimpleHolder {
        val inflanter = LayoutInflater.from(context).inflate(R.layout.item_layout,parent, false)
        return MySimpleHolder(inflanter)
    }

    override fun getItemCount(): Int {
       return listData.size
    }

    override fun onBindViewHolder(holder: MySimpleHolder, position: Int) {
        val person = listData[position]
        holder.setData(person, position)
    }


    inner class MySimpleHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun setData(person: SimpleDataClass?, position: Int){
                itemView.name.text = person!!.name
                itemView.surname.text = person!!.surname
                itemView.year.text = person!!.year.toString()
        }

//        var name: TextView? = null
//        var surname: TextView? = null
//        var year: TextView? = null
//
//
//        init {
//            name = itemView.findViewById(R.id.name)
//            surname = itemView.findViewById(R.id.surname)
//            year = itemView.findViewById(R.id.year)
//        }
//
//        fun bind(person: SimpleDataClass){
//            name?.text = person.name.toString()
//            surname?.text = person.surname.toString()
//            year?.text = person.year.toString()
//
//        }

    }
}