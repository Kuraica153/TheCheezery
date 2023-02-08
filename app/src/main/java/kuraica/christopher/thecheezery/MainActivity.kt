package kuraica.christopher.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the UI elements
        val btnGetStarted: Button = findViewById(R.id.btnGetStarted) as Button

        // Set event listeners
        btnGetStarted.setOnClickListener {
            // Navigate to the register activity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}