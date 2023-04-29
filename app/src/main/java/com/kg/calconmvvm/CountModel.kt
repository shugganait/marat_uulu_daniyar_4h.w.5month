package com.kg.calconmvvm

class CountModel {
    fun increment(count: String): String {
        var innerCount = Integer.parseInt(count)
        innerCount++
        return innerCount.toString()
    }
    fun decrement(count: String): String {
        var innerCount = Integer.parseInt(count)
        innerCount--
        return innerCount.toString()
    }
}