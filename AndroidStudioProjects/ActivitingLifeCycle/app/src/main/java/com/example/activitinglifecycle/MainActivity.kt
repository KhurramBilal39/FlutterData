package com.example.activitinglifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var viewModel : ActivityMainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ActivityMainViewModel::class.java)
        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnCount = findViewById<Button>(R.id.btnCount)

//        tvCount.text = btnCount.toString()
        //tvCount.text = viewModel.count.toString()

        viewModel.count.observe(this, Observer {
            tvCount.text = it.toString()
        })

        btnCount.setOnClickListener {
            //++count
           // tvCount.text = count.toString()

            viewModel.updateCount()
            //tvCount.text = viewModel.count.toString()
        }
    }
}