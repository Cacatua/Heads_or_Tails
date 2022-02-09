package com.kktua.headsortails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kktua.headsortails.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.getIntExtra("result", 0) == 0)
            binding.ivResult.setImageResource(R.drawable.moeda_cara)
        else
            binding.ivResult.setImageResource(R.drawable.moeda_coroa)

        createButtonListening()

    }

    private fun createButtonListening() {
        binding.ivBack.setOnClickListener {
            finish()
        }
    }
}