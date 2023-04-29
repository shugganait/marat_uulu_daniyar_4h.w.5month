package com.kg.calconmvvm

import androidx.lifecycle.MutableLiveData

class Repository {

    fun getincrement(count: String):String {
        return CountModel().increment(count)
    }
    fun getDecrement(count: String):String{
        return CountModel().decrement(count)
    }
}