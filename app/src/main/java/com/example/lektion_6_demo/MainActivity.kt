package com.example.lektion_6_demo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Variables
        val btnVerifyPassword: Button = findViewById(R.id.btn_submit)
        val etPassword: EditText = findViewById(R.id.editText_password)
        val userList = ArrayList<User>()

        // Create User
        val benny = User("Benny", "123456")
        val frida = User("Frida", "9")
        val anton = User("Anton", "hej")

        // Populate ArrayList
        userList.add(benny)
        userList.add(frida)
        userList.add(anton)

        println(userList)

        // On Verify
        btnVerifyPassword.setOnClickListener {
            println(etPassword.text.toString())
            val textInputPassword = etPassword.text.toString()

            // For loop
            for (user in userList) {

                if (textInputPassword == user.password) {
                    println("TRUE - LOGGING IN")
                } else {
                    println("FALSE - WRONG CREDENTIALS")
                }

            }

            /*
            if (benny.password == textInputPassword) {
                println("TRUE")
            } else {
                println("FALSE")
            }*/


        }


    }
}