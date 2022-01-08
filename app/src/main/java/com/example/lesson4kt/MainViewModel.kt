package com.example.lesson4kt

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val counterTwo = MutableLiveData<String>()

    fun increment(){
        mCounter++
        counter.value = mCounter
        counterTwo.value = "+"
    }
    fun decrement(){
        mCounter--
        counter.value = mCounter
        counterTwo.value = "-"
    }



}