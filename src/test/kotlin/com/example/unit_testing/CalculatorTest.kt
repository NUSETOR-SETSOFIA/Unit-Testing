package com.example.unit_testing

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.random.Random
import kotlin.test.*

@SpringBootTest
class CalculatorTest {
    private var sum: Int? = null
    private var num1: Int? = null
    private var num2: Int? = null
    private var calculator: Calculator = Calculator()

    @BeforeTest
    fun assignAValueToSum() {
        num1 = Random.nextInt()
        num2 = Random.nextInt()

        sum = num1!! + num2!!
    }

    /**
     * This method tests the addition of two numbers using the addNumbers method.
     * It verifies that the result is equal to the expected sum.
     */
    @Test
    fun addNumbers() {
        val sumTest = calculator.addNumbers(num1!!, num2!!)
        assertTrue { sum == sumTest }
    }

    /**
     * This method tests the addition of two numbers using the addNumbers method
     * but intentionally verifies that the result is not equal to the expected sum,
     * demonstrating a mutation test case.
     */
    @Test
    fun addNumbersMutated() {
        val sumTest = calculator.addNumbers(num1!!, num2!!)
        assertFalse { sum != sumTest} // the mutation
    }


    @AfterTest
    fun clearSumValue() {
        sum = null
    }
}