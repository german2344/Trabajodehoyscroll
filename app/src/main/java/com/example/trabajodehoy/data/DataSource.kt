package com.example.trabajodehoy.data

import com.example.trabajodehoy.Model.RecyclearData
import com.example.trabajodehoy.R

class DataSource {
    fun loadAffirmations():List<RecyclearData>{
        return listOf<RecyclearData>(
            RecyclearData(R.string.titel1,R.drawable.angular),
            RecyclearData(R.string.titel2,R.drawable.c),
            RecyclearData(R.string.titel3,R.drawable.cmas),
            RecyclearData(R.string.titel4,R.drawable.java),
            RecyclearData(R.string.titel5,R.drawable.javascript),
        )
    }
}