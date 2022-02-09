package com.kktua.headsortails

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kktua.headsortails.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createButtonListening()

    }

    private fun createButtonListening() {
        binding.ivJogar.setOnClickListener {
            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", Random.nextInt(2))
            startActivity(intent)
        }
    }
}