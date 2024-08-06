package com.example.unit_testing.mocking

import jakarta.annotation.Generated
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class User(
    @Id
    var userId: UUID,
    var username: String,
    var age: Int
)
