package com.example.notifygas.entity

sealed class GweiRange<out T> {

    data class Max<out T>(var maxValue : Int) : GweiRange<T>()
    data class Min<out T>(var minValue : Int) : GweiRange<T>()
    data class Aver<out T>(var averValue : Int) : GweiRange<T>()
}
