package com.example.recycler.adapter


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.holder.ListHolder
import com.example.recycler.model.ListModel


class ListAdapter(private val list: List<ListModel>) : RecyclerView.Adapter<ListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return ListHolder(parent)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(list[position])
    }

}
