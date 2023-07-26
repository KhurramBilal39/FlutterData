package com.example.learnaboutclassesandobjects

import android.util.Log

class Driver (name:String,TyreNo : Int){

    var driverName = ""
    var carTyre = 1

    init {
        driverName = name
        carTyre = TyreNo

    }
    fun showDriverSkill(){
        Log.i("MyTag","The name of Driver is ${driverName} and the total tyre is ${carTyre}")
    }

}