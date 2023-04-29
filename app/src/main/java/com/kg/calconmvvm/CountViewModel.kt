package com.kg.calconmvvm

class CountViewModel {
    fun getIncremented(count: String):String {
        return Repository().getincrement(count)
    }
    fun getDecremented(count: String):String {
        return Repository().getDecrement(count)
    }
}