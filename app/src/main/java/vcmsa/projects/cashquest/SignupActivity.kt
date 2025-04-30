package vcmsa.projects.cashquest

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val firstNameInput = findViewById<EditText>(R.id.firstNameInput)
        val lastNameInput = findViewById<EditText>(R.id.lastNameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val confirmPasswordInput = findViewById<EditText>(R.id.confirmPasswordInput)
        val privacyCheckbox = findViewById<CheckBox>(R.id.privacyCheckbox)
        val signUpButton = findViewById<Button>(R.id.signUpButton)
        val backArrow = findViewById<ImageView>(R.id.backArrow)

        backArrow.setOnClickListener {
            finish() // Go back to previous activity
        }

        signUpButton.setOnClickListener {
            val firstName = firstNameInput.text.toString()
            val lastName = lastNameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            val confirmPassword = confirmPasswordInput.text.toString()

            when {
                firstName.isBlank() || lastName.isBlank() || email.isBlank()
                        || password.isBlank() || confirmPassword.isBlank() ->
                    Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()

                password != confirmPassword ->
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()

                !privacyCheckbox.isChecked ->
                    Toast.makeText(this, "Please accept the privacy policy", Toast.LENGTH_SHORT).show()

                else -> {
                    Toast.makeText(this, "Signup successful!", Toast.LENGTH_SHORT).show()
                    // Optional: Go to login or home screen
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}
