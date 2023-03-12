package com.example.lektion_6_demo

class User(
    var username: String,
    var password: String
) {

    override fun toString(): String {
        return "User(username='$username', password='$password')"
    }
}

