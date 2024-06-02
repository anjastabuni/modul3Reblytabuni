package com.example.modul3reblytabuni

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul3reblytabuni.databinding.ActivityProjectRecyclearViewBinding

class ProjectRecyclerView : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var binding: ActivityProjectRecyclearViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project_recyclear_view)

        binding = ActivityProjectRecyclearViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageList: List<Image> = listOf(
            Image(
                R.drawable.foot1,
                "papeda",
                "kua kuning"
            ),
            Image(
                R.drawable.foot2,
                "Papeda",
                "papeda kua kuning"
            ),
            Image(
                R.drawable.foot3,
                "Papeda",
                "papeda kua kuning"
            ),
            Image(
                R.drawable.foot4,
                "Papeda",
                "papeda kua kuning"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, ActivityDetail::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}

//        val exampleList: List<ExampleItem> = generateDataList(100)
//
//        binding.myRecyclerView.adapter = ExampleAdapter(exampleList)
//        binding.myRecyclerView.layoutManager = LinearLayoutManager(this)
//        binding.myRecyclerView.setHasFixedSize(true)
//    }
//    private fun generateDataList(size: Int):List<ExampleItem> {
//        val list = ArrayList<ExampleItem>()
//
//        for (i in 0 until size) {
//            val drawable = when (i % 3) {
//                0 -> R.drawable.ic_android
//                1 -> R.drawable.ic_audio
//                else -> R.drawable.ic_sun
//            }
//
//            val item = ExampleItem(drawable, "Name $i", "Phone Number $i")
//            list += item
//        }
//        return list
//    }
//    }
