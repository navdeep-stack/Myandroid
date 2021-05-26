package com.example.myandroid

import org.junit.Assert.assertEquals
import org.junit.Test

class ConverterTest {

    @Test

    fun testcTof(){
        val converter: Convertor = Convertor()
        var expectedValue: Double = 53.6
        var celsius: Double = 12.0
        assertEquals("Celsius to Faherheit Failed", expectedValue,converter.cTof(celsius),0.0)


    }

    @Test
    fun testfToc(){

        val convertor: Convertor = Convertor()
        var expectedValue=12.0
        var fahernheit = 54.0

        assertEquals("Faherheit to Celsius Failed", expectedValue,convertor.cTof(fahernheit),0.0)


    }
}