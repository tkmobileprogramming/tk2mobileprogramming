package com.example.tk2_mobileprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.google.android.material.card.MaterialCardView

class CatalogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        supportActionBar?.title = "Catalog"

        val imageView1: ImageView = findViewById(R.id.imageView1)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        val imageView3: ImageView = findViewById(R.id.imageView3)

        // Load images from local resources
        imageView1.setImageResource(R.drawable.image1)
        imageView2.setImageResource(R.drawable.image2)
        imageView3.setImageResource(R.drawable.image3)

        // Set content descriptions for accessibility
        imageView1.contentDescription = "Catalog image 1"
        imageView2.contentDescription = "Catalog image 2"
        imageView3.contentDescription = "Catalog image 3"
    }
}