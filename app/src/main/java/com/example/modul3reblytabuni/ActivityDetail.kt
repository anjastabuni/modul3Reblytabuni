package com.example.modul3reblytabuni

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.modul3reblytabuni.databinding.ActivityDetailBinding

@Suppress("DEPRECATION")
class ActivityDetail : AppCompatActivity() {
        private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val  image = intent.getParcelableExtra<Image>(ProjectRecyclerView.INTENT_PARCELABLE)
        val  imgSrc = binding.imageDetail
        val imgTitle = binding.imageTitle
        val imgDesc = binding.imageDesc

        imgSrc.setImageResource(image!!.imageSrc)
        imgTitle.text = image.imageTitle
        imgDesc.text = image.imageDesc
    }
}