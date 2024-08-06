package com.example.unit_testing.mocking

import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import kotlin.random.Random
import kotlin.test.BeforeTest
import kotlin.test.assertTrue

class UserServiceTest {
    private val userService = UserService()
    private var count: Int? = null
    private val users = ArrayList<User>()

    @BeforeTest
    fun assignTheRandomCount() {
        count = Random.nextInt(5)
        var iterate: Int = 0

        while (count!! > iterate) {
            iterate += 1

            users.add(
                userService.addNewUser(
                    "funky_developer",
                    23
                )
            )
        }
    }

    @Test
    fun addNewUser() {
        println(users)

        assertTrue { users.size == count }
    }
}