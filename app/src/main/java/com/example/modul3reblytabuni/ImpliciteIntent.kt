package com.example.modul3reblytabuni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.modul3reblytabuni.databinding.ActivityImpliciteIntentBinding

class ImpliciteIntent : AppCompatActivity() {
    private lateinit var binding: ActivityImpliciteIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicite_intent)

        binding = ActivityImpliciteIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShare.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, binding.editText.text.toString())
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to"))
        }

        binding.btnCall.setOnClickListener {
            val uri = Uri.parse("tel : " + binding.editPhoneNumber.text.toString())
            startActivity(Intent(Intent.ACTION_DIAL,uri))
        }
        binding.btnOpenGoogleMap.setOnClickListener {
            val uri = Uri.parse("geo:0,0?q=" + binding.editLocation.text.toString())
            startActivity(Intent(Intent.ACTION_VIEW,uri))
        }
        binding.btnOpenWebsite.setOnClickListener {
            val uri = Uri.parse(binding.editWebsite.text.toString())
            startActivity(Intent(Intent.ACTION_VIEW,uri))
        }
        binding.btnOpenCamera.setOnClickListener {
            startActivity(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }
        binding.btnOpenGalery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("content//media/external/images/media/")
            startActivity(intent)
        }

        binding.btnOpenAlarm.setOnClickListener {
            startActivity(Intent(AlarmClock.ACTION_SHOW_ALARMS))
        }

    }
}