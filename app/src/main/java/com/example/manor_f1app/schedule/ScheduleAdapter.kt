package com.example.manor_f1app.schedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_f1app.R

class ScheduleAdapter (private val listener: MyClickListener) : RecyclerView.Adapter<ScheduleAdapter.MyViewHolder>() {

    private val scheduleList = ArrayList<Schedule>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.schedule_item,
            parent, false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = scheduleList[position]

        holder.round.text = currentitem.round.toString()
        holder.name.text = currentitem.name
        holder.country.text = currentitem.country

    }

    override fun getItemCount() = scheduleList.size

    fun updateScheduleList(scheduleList : List<Schedule>){

        this.scheduleList.clear()
        this.scheduleList.addAll(scheduleList)
        notifyDataSetChanged()

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val round : TextView = itemView.findViewById(R.id.round)
        val name : TextView = itemView.findViewById(R.id.name)
        val country : TextView = itemView.findViewById(R.id.country)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                val data = scheduleList.get(position)

                val round = data.round
                val name = data.name.toString()
                val country = data.country.toString()
                val track = data.track.toString()
                val turns = data.turns
                val first = data.first

                listener.onClick(round, name, country, track, turns, first)
            }
        }
    }

    interface MyClickListener{
        fun onClick(round: Int?, name: String?, country: String?, track: String?, turns: Int?, first: Int?)
    }
}