package com.dmitriypo95.srs8

sealed interface People {

    open class Human(
        open val name: String,
        open val age: Int
    )

    data class Man(
        override val name: String,
        override val age: Int,
        val phoneNumber: String
    ) : Human(name, age), People


    data class Woman(
        override val name: String,
        override val age: Int,
        val email: String
    ) : Human(name, age), People
}