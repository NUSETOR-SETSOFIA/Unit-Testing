package com.example.unit_testing.mocking

import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService {

    fun addNewUser(userName: String, age: Int): User {

        return User(
            UUID.randomUUID(),
            userName,
            age
        )
    }
}