package com.example.recycler.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.model.Article
import com.example.singeactivitymvvm.R


class ListHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.row_item, container, false)
) {
    val imgProfilPhoto: ImageView = itemView.findViewById(R.id.imgProfilPhoto)
    val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
    val txtDetail: TextView = itemView.findViewById(R.id.txtdetail)
    val txtCompany: TextView = itemView.findViewById(R.id.namecompany)

    fun bind(listmodel: Article) {
        Glide.with(itemView.context).load(listmodel.urlToImage).into(imgProfilPhoto)
        txtTitle.text = listmodel.title
        txtDetail.text = listmodel.description
        txtCompany.text = listmodel.author

    }
}
