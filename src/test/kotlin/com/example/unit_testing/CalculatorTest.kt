package com.example.unit_testing

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.*

@SpringBootTest
class CalculatorTest {
    private var sum: Int? = null
    private var calculator: Calculator = Calculator()

    @BeforeTest
    fun assignAValueToSum() {
        sum = 20
    }

    /**
     * This method tests the addition of two numbers using the addNumbers method.
     * It verifies that the result is equal to the expected sum.
     */
    @Test
    fun addNumbers() {
        val sumTest = calculator.addNumbers(10, 10)
        assertTrue { sum == sumTest }
    }

    /**
     * This method tests the addition of two numbers using the addNumbers method
     * but intentionally verifies that the result is not equal to the expected sum,
     * demonstrating a mutation test case.
     */
    @Test
    fun addNumbersMutated() {
        val sumTest = calculator.addNumbers(10, 10)
        assertFalse { sum == sumTest} // the mutation
    }


    @AfterTest
    fun clearSumValue() {
        sum = null
    }
}