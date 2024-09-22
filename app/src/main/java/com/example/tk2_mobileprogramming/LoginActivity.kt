package com.example.tk2_mobileprogramming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameLayout: TextInputLayout
    private lateinit var passwordLayout: TextInputLayout
    private lateinit var usernameEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var loginButton: MaterialButton
    private lateinit var progressIndicator: CircularProgressIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.title = "TK2 - Mobile Programming"

        usernameLayout = findViewById(R.id.usernameLayout)
        passwordLayout = findViewById(R.id.passwordLayout)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
        progressIndicator = findViewById(R.id.progressIndicator)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty()) {
                usernameLayout.error = "Username is required"
                return@setOnClickListener
            } else {
                usernameLayout.error = null
            }

            if (password.isEmpty()) {
                passwordLayout.error = "Password is required"
                return@setOnClickListener
            } else {
                passwordLayout.error = null
            }

            progressIndicator.show()
            loginButton.isEnabled = false

            // Simulate network delay
            loginButton.postDelayed({
                progressIndicator.hide()
                loginButton.isEnabled = true

                if (username == "pengguna" && password == "masuk") {
                    val intent = Intent(this, CatalogActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Snackbar.make(loginButton, "Invalid username or password", Snackbar.LENGTH_LONG).show()
                }
            }, 100)
        }
    }
}