package vcmsa.projects.cashquest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class new_Expense : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_expense)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.NewExpense)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent = Intent(
                this@new_Expense,
                HomeActivity::class.java
            )
            startActivity(intent)
        }

        val categoryText: EditText = findViewById(R.id.categoryDisplay)

        findViewById<Button>(R.id.btnGroceries).setOnClickListener {
            categoryText.setText("Groceries")
        }
        findViewById<Button>(R.id.btnFuel).setOnClickListener {
            categoryText.setText("Fuel")
        }
        findViewById<Button>(R.id.btnFood).setOnClickListener {
            categoryText.setText("Food")
        }
        findViewById<Button>(R.id.btnClothing).setOnClickListener {
            categoryText.setText("Clothing")
        }
    }
}
