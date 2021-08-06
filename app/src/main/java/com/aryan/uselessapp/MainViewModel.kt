package com.aryan.uselessapp

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(application: Application) : ViewModel() {

    //var count = MutableLiveData<Int>()
    var count =0

    init{
        Log.i("MainViewModel","ViewModel Created")
        //count.value = 0
    }

    override fun onCleared() {
        Log.i("MainViewModel","ViewModel destroyed")
    }

    fun countAdd(){
        count +=1
        //count.value = count.value?.plus(1)
    }
    fun countMinus(){
        count -=1
        //count.value = count.value?.minus(1)
    }


/* fun logMsg(){
        score = 5
        Log.i("CLICK","called")
    } */



}