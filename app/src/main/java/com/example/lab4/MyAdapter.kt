package com.example.lab4

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: MainActivity) : RecyclerView.Adapter<MyHoder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyHoder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemlayout, parent, false)
        return MyHoder(view)
    }

    override fun onBindViewHolder(holder: MyHoder, position: Int) {
        val item = ListItems.get(position)
        holder.iv_icon.setImageResource(item.icon)
        holder.tv_name.text = item.name
        holder.tv_detail.text = item.detail
        holder.itemView.setOnClickListener {
            val inten= Intent(context, MainActivity2::class.java)
            inten.putExtra("name",item.name)
            inten.putExtra("detail",item.detail)
            context.startActivity(inten)
        }
    }

    override fun getItemCount(): Int {
        return ListItems.size
    }
}
