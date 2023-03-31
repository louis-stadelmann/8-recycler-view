package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ListItemAdapter
import com.example.recyclerview.model.ListItemModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvMain)


        val adapter = ListItemAdapter(arrayListOf(ListItemModel("dfsfsdf"), ListItemModel("ddddfsfsdf")))
        recyclerView.adapter = adapter
    }
}