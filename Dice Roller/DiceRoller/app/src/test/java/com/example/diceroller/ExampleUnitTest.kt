package com.example.diceroller
import org.junit.Test

import org.junit.Assert.*
import org.junit.Assert.assertTrue as assertTrue1

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isCorrection(){
        assertEquals(5, 2 + 3)
    }

    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue1("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

}