package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "StateChange"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "OnCreate")

        val listView = findViewById<ListView>(R.id.ListView)
        val favorite_food = arrayOf("Fries", "Mash Potatoes", "Potatoe Wedges", "Pizza", "Corn",
            "Carrots", "Broccoli", "Peas", "Pasta", "Sandwiches", "Strawberries", "Kiwis",
            "Mangoes", "Plums", "Tomatoes", "Grapes", "Cucumbers", "Pickles", "Ice Cream")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            favorite_food
        )
        listView.adapter= arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Item Selected "+ favorite_food[i], Toast.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "OnRestart")
    }

}