package com.example.recycler.adapter


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.model.Article
import com.example.recycler.holder.ListHolder


class ListhAdapter(private val list: List<Article>) : RecyclerView.Adapter<ListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return ListHolder(parent)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(list[position])
    }

}
