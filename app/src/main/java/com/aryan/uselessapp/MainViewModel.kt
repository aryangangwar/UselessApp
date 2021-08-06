package com.aryan.uselessapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = MutableLiveData<Int>()

    init{
        Log.i("MainViewModel","ViewModel Created")
        count.value = 0
    }

    override fun onCleared() {
        Log.i("MainViewModel","ViewModel destroyed")
    }

    fun countAdd(){
        count.value = count.value?.plus(1)
    }
    fun countMinus(){
        count.value = count.value?.minus(1)
    }


/* fun logMsg(){
        score = 5
        Log.i("CLICK","called")
    } */



}