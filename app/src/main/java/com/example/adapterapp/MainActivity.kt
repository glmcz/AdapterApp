package com.example.adapterapp

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : SingleFragmentActivity()  {
//
//    override fun createFragment() = MainFragment.newInstance()
//
//}


class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = SimpleAdapter(this, MovieObject.listOfActors)
        recyclerView.adapter = adapter

    }
}
