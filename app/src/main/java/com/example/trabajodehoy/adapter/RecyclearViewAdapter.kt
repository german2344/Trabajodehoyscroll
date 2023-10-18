package com.example.trabajodehoy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajodehoy.Model.RecyclearData
import com.example.trabajodehoy.R
import kotlinx.coroutines.NonDisposableHandle.parent

class RecyclearViewAdapter(private val context: Context, private val dataset: List<RecyclearData>) :
    RecyclerView.Adapter<RecyclearViewAdapter.RecyclearViewHolder>() {

    class RecyclearViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val courseTv:TextView = view.findViewById(R.id.text)
        val courseIV:ImageView = view.findViewById(R.id.img)
        
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclearViewHolder {

        val itemView = LayoutInflater.from(context).inflate(R.layout.cartview, parent, false)
        return RecyclearViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclearViewHolder, position: Int) {
        val recyclearData = dataset[position]
        holder.courseTv.text = context.resources.getString(recyclearData.stringResurceId)
        holder.courseIV.setImageResource(recyclearData.imageResourceId)
    }

    override fun getItemCount(): Int {

        return dataset.size
        return  dataset.size
    }
}
