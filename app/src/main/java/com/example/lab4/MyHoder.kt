package com.example.lab4

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyHoder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val iv_icon: ImageView = itemView.findViewById(R.id.iv_icon)
    val tv_name: TextView = itemView.findViewById(R.id.tv_name)
    val tv_detail: TextView = itemView.findViewById(R.id.tv_detail)
}
