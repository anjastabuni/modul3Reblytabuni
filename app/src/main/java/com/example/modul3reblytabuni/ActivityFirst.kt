package com.example.modul3reblytabuni

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.modul3reblytabuni.databinding.ActivityFirstBinding

class ActivityFirst : AppCompatActivity() {
    private lateinit var binding : ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)

        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val namamessage = binding.namaMessage.text.toString()
            val emailmessage = binding.emailMessage.text.toString()
            val phonemessage = binding.phoneMessage.text.toString()
            val intent = Intent(this, ActivitySecond::class.java).apply {
                putExtra(ActivitySecond.EXTRA_NAME, namamessage)
                putExtra(ActivitySecond.EXTRA_EMAIL, emailmessage)
                putExtra(ActivitySecond.EXTRA_PHONE, phonemessage)
            }
            startActivity(intent)
        }


    }
}