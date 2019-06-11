package com.example.adapterapp

import java.time.Year


data class SimpleDataClass (var name: String, var surname: String, var year: Int)


object MovieObject{

    val listOfActors = listOf<SimpleDataClass>(

    SimpleDataClass("John","Snow",1234),
    SimpleDataClass("Matheo","Mithic",1787),
    SimpleDataClass("John","Snow",1234),
    SimpleDataClass("Matheo","Mithic",1787),
    SimpleDataClass("John","Snow",1234),
    SimpleDataClass("Matheo","Mithic",1787),
    SimpleDataClass("John","Snow",1234),
    SimpleDataClass("John","Snow",1234)
    )
}