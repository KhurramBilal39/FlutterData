package com.example.learnaboutclassesandobjects

import android.util.Log

class MyCar : Cars() {

    override fun start(){
    Log.i("MyTag","My Car is Starting")
    }
}