package com.example.manor_f1app.driver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_f1app.R

class DriverAdapter(private val listener: MyClickListener) : RecyclerView.Adapter<DriverAdapter.MyViewHolder>() {

    private val driverList = ArrayList<Driver>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.driver_item,
            parent, false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = driverList[position]

        holder.rank.text = currentitem.rank.toString()
        holder.firstname.text = currentitem.firstname
        holder.lastname.text = currentitem.lastname

    }

    override fun getItemCount() = driverList.size

    fun updateDriverList(driverList : List<Driver>){

        this.driverList.clear()
        this.driverList.addAll(driverList)
        notifyDataSetChanged()

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val rank : TextView = itemView.findViewById(R.id.rank)
        val firstname : TextView = itemView.findViewById(R.id.firstname)
        val lastname : TextView = itemView.findViewById(R.id.lastname)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                listener.onClick(position)
            }
        }
    }

    interface MyClickListener{
        fun onClick(position: Int)
    }

}