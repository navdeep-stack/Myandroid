package com.example.myandroid

class Convertor {

    public fun fToc(celsius : Double) : Double{
        return((celsius * 9)/5)+32
    }

    public fun cTof(fahrenheit: Double) : Double{
        return ((fahrenheit-32)*5/9)
    }

}