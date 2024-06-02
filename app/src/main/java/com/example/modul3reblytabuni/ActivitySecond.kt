package com.example.modul3reblytabuni

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.modul3reblytabuni.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "com.example.modul3reblytabuni.NAME"
        const val EXTRA_EMAIL = "com.example.modul3reblytabuni.EMAIL"
        const val EXTRA_PHONE = "com.example.modul3reblytabuni.PHONE"
    }

    private lateinit var binding: ActivitySecondBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(EXTRA_NAME) ?: "N/A"
        val email = intent.getStringExtra(EXTRA_EMAIL) ?: "N/A"
        val phone = intent.getStringExtra(EXTRA_PHONE) ?: "N/A"

        binding.namaMessage.text = "Nama Lengkap: $name"
        binding.emailMessage.text = "Alamat Email: $email"
        binding.phoneMessage.text = "Telp: $phone"
    }
}