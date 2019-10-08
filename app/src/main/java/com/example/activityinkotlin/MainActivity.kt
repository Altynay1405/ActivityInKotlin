package com.example.activityinkotlin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOpenActivity = findViewById<Button>(R.id.btn_open_activity)
        btnOpenActivity.setOnClickListener {
           val intent = Intent(this, ActivityExample::class.java)
         startActivity(intent)
         //     Toast.makeText(this, "you clicked on activity example", Toast.LENGTH_SHORT).show()
        }

        var btnStartActivityForResult = findViewById(R.id.btn_start_activity_for_result) as Button
        btnStartActivityForResult.setOnClickListener {
            val intent = Intent(this@MainActivity, StartActivityForResultActivity::class.java)
            startActivity(intent)
            Toast.makeText(
                this@MainActivity,
                "you clicked on start Activity Example",
                Toast.LENGTH_SHORT
            ).show()
        }

        var btnDefaultIntentActivity = findViewById(R.id.default_intent_activity) as Button
        btnDefaultIntentActivity.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Hey check my favourite manga at : http://readmanga.me "
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
    }
}
