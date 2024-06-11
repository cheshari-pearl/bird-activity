package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso


class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1548960095-770e3e6364de?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzB8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView5)
    }
}