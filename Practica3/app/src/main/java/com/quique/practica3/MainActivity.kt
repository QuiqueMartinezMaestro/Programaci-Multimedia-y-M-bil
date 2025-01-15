package com.quique.practica3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var usernameInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameLayout = findViewById<TextInputLayout>(R.id.username_layout)
        val passwordLayout = findViewById<TextInputLayout>(R.id.password_layout)
        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)

        loadUserCredentials()

        val loginButton = findViewById<Button>(R.id.button1)
        loginButton.setOnClickListener {
            saveUserCredentials()
            val intent = Intent(this, NoticiasActivity::class.java)
            startActivity(intent)
        }
    }

    private fun saveUserCredentials() {
        val username = usernameInput.text.toString()
        val password = passwordInput.text.toString()

        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("username", username)
        editor.putString("password", password)
        editor.apply()
    }

    private fun loadUserCredentials() {
        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val savedUsername = sharedPreferences.getString("username", "")
        val savedPassword = sharedPreferences.getString("password", "")

        usernameInput.setText(savedUsername)
        passwordInput.setText(savedPassword)
    }
}

