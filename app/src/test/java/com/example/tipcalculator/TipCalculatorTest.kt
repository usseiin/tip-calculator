package com.example.tipcalculator

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TipCalculatorTest {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.0
        val tipPercent = 20.0
        val roundUp = false
        val expectedTip = "₦2.00"
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }
}