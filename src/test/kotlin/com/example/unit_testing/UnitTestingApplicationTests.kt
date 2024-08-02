package com.example.unit_testing

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.AfterTest
import kotlin.test.assertTrue

@SpringBootTest
class UnitTestingApplicationTests {

	var num: Int? = null

	/**
	 * The @BeforeEach annotation is used to perform some
	 * actions before the actual testing begins
	 */
	@BeforeEach
	fun beforeTest() {
		println("Default number: $num")

		num = 5
		println("New number: $num")
	}

	/**
	 * The @Test annotation marks a class that is responsible for the
	 * test. The class implements a particular test functionality
	 */
	@Test
	fun test() {
		assertTrue(num!! == 5, "Number should be equal to 10")
	}

	/**
	 * This annotation is used to perform some actions that are to be performed after a certain
	 * test is completed.
	 */
	@AfterTest
	fun resetNumberAfterTheTest() {
		println("New number after test: $num")
	}
}
