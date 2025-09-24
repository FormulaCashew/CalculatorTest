package com.example.calculatortest

import org.junit.Test
import org.junit.Assert.*

class CalculatorTest {
    @Test
    fun add_test(){
        val calculator = Calculator()
        val result = calculator.add(5,5)
        assertEquals(10,result)
    }
    @Test
    fun mult_test(){
        val calculator = Calculator()
        val result = calculator.mult(5,5)
        assertEquals(25,result)
    }
}
