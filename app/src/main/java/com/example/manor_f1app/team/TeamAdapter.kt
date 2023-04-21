package com.example.manor_f1app.team

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_f1app.R


class TeamAdapter (private val listener: MyClickListener) : RecyclerView.Adapter<TeamAdapter.MyViewHolder>() {
    private val teamList = ArrayList<Team>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.team_item,
            parent, false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = teamList[position]

        holder.rank.text = currentitem.rank.toString()
        holder.name.text = currentitem.name

    }

    override fun getItemCount() = teamList.size

    fun updateTeamList(teamList : List<Team>){

        this.teamList.clear()
        this.teamList.addAll(teamList)
        notifyDataSetChanged()

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val rank : TextView = itemView.findViewById(R.id.rank)
        val name : TextView = itemView.findViewById(R.id.teamname)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                val data = teamList.get(position)

                val rank = data.rank
                val name = data.name
                val chief = data.chief
                val driver1 = data.driver1
                val driver2 = data.driver2
                val championships = data.championships

                listener.onClick(rank, name, chief, driver1, driver2, championships)
            }
        }
    }

    interface MyClickListener{
        fun onClick(rank: Int?, name: String?, chief: String?, driver1: String?, driver2: String?, championships: Int?)
    }
}