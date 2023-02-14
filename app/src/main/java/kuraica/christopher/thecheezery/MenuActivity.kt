package kuraica.christopher.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Initialize the UI elements
        val btnColdDrinks: Button = findViewById(R.id.btnColdDrinks) as Button
        val btnHotDrinks: Button = findViewById(R.id.btnHotDrinks) as Button
        val btnSweets: Button = findViewById(R.id.btnSweets) as Button
        val btnSalties: Button = findViewById(R.id.btnSalties) as Button

        // Set event listeners
        btnColdDrinks.setOnClickListener {
            // Navigate to the cold drinks activity
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "cold_drinks")
            startActivity(intent)
        }
        btnHotDrinks.setOnClickListener {
            // Navigate to the hot drinks activity
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "hot_drinks")
            startActivity(intent)
        }
        btnSweets.setOnClickListener {
            // Navigate to the sweets activity
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "sweets")
            startActivity(intent)
        }
        btnSalties.setOnClickListener {
            // Navigate to the salties activity
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("category", "salties")
            startActivity(intent)
        }
    }
}