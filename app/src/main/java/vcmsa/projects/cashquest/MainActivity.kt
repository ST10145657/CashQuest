package vcmsa.projects.cashquest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

class MainActivity : AppCompatActivity() { // Use AppCompatActivity (not ComponentActivity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Link to your XML layout

        val loginButton = findViewById<Button>(R.id.loginButton) // Connect to XML button

        loginButton.setOnClickListener {
            // Go to HomeActivity when loginButton is pressed
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val SignupButton = findViewById<Button>(R.id.signupButton) // Connect to XML button

        SignupButton.setOnClickListener {
            // Go to HomeActivity when loginButton is pressed
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

    }
}
