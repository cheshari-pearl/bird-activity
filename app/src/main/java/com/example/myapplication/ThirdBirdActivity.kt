package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity: AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener{
            finish()
        }
        binding.btnNext3.setOnClickListener{
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1518992028580-6d57bd80f2dd?q=80&w=1615&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView3)
    }
}
