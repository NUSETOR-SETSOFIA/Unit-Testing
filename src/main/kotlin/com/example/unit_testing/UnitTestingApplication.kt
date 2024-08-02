package com.example.unit_testing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UnitTestingApplication

fun main(args: Array<String>) {
	runApplication<UnitTestingApplication>(*args)
}
