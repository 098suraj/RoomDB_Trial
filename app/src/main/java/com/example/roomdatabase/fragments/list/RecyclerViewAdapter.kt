package com.example.roomdatabase.fragments.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.Model.User
import kotlinx.android.synthetic.main.listitem.view.*

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.recyclerViewHolder>() {
    private var data= emptyList<User>()
    class recyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return recyclerViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {
        val currentItem=data[position]
        holder.itemView.namedetails_et.text=currentItem.firstName+" "+ currentItem.lastName
        holder.itemView.agedetails_et.text=currentItem.age.toString()
        holder.itemView.id_et.text=currentItem.id.toString()
        holder.itemView.list_item.setOnClickListener {
            val action=listFragmentDirections.actionListFragmentToUpdateFragment(currentItem)
            holder.itemView.findNavController().navigate(action)
        }
    }
    fun setData(user:List<User>){
        this.data=user
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}