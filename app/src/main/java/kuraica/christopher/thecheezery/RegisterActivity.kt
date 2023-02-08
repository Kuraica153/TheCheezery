package kuraica.christopher.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize the UI elements
        val btnSignIn: Button = findViewById(R.id.btnSignIn) as Button

        // Set event listeners
        btnSignIn.setOnClickListener {
            // Navigate to the menu activity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}