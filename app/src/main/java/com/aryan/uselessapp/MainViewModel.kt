package com.aryan.uselessapp

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = 0
    var score = 0

    init{
        Log.i("MainViewModel","ViewModel Created")
    }

    override fun onCleared() {
        Log.i("MainViewModel","ViewModel destroyed")
    }

    fun countAdd(){
        count += 1
    }
    fun countMinus(){
        count -= 1
    }
    fun logMsg(){
        score = 5
        Log.i("CLICK","called")
    }



}