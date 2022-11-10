package com.bits.support.images

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bits.support.databinding.ActivityPhotoBinding
import com.bits.support.views.hide
import com.bits.support.views.show

class ImageActivity: AppCompatActivity() {

    lateinit var binding : ActivityPhotoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhotoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        create()
    }

    private fun create() {
        val imageUrl = intent.getStringExtra("image_url").toString()

        imageProgress(true)
        binding.idImage.loadImage(imageUrl){
            imageProgress(false)
            viewImage(binding.idImage,binding.idRoot)
        }

        binding.idBack.setOnClickListener {
            finish()
        }
    }

    private fun imageProgress(isLoading : Boolean){
        if (isLoading){
            binding.idProgressBar.show()
        } else {
            binding.idProgressBar.hide()
        }
    }
}