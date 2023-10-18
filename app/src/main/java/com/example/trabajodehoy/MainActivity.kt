package com.example.trabajodehoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajodehoy.adapter.RecyclearViewAdapter
import com.example.trabajodehoy.data.DataSource

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataSource: DataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset=DataSource().loadAffirmations()
        val recyclerView= findViewById<RecyclerView>(R.id.ConrseRv)
        val layouManager = LinearLayoutManager(this)    //aqui se cambia la orientación
        recyclerView.layoutManager=layouManager
        recyclerView.adapter= RecyclearViewAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}