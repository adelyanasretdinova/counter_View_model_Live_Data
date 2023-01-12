package com.example.counterwithviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val liveData = MutableLiveData<Int>(0)
//    var counter: Int = 0
    fun increment() {
//        counter ++
        val currentValue = liveData.value
    if (currentValue != null) {
        liveData.value = currentValue +1
    }
    }
}