package com.inhohyun.listview_second_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<String>()

        list_item.add("A")
        list_item.add("B")
        list_item.add("C")

        val listview = findViewById<ListView>(R.id.mainListView)
        val listviewAdapter = ListViewAdapter(list_item)
        listview.adapter = listviewAdapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, list_item[i], Toast.LENGTH_LONG).show()
        }
    }

}