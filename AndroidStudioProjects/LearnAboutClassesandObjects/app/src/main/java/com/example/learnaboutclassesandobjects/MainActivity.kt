package com.example.learnaboutclassesandobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val car = Cars()
//        car.start()
//
//        val drivers = Driver("Khurram",5)
//        drivers.showDriverSkill()
        val myCar = MyCar()
        myCar.start()
    }
}