package com.busraerpay.tweenanimationhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewAnimationUtils
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.busraerpay.tweenanimationhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var animation: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        binding.fadeButton.setOnClickListener(this)
        binding.scaleButton.setOnClickListener(this)
        binding.rotateButton.setOnClickListener(this)
        binding.translateButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.fadeButton.id -> {
                animation= AnimationUtils.loadAnimation(this,R.anim.fade_anim)
                binding.girlImage.startAnimation(animation)
            }
            binding.scaleButton.id -> {
                animation= AnimationUtils.loadAnimation(this,R.anim.scale_anim)
                binding.girlImage.startAnimation(animation)
            }
            binding.translateButton.id -> {
                animation= AnimationUtils.loadAnimation(this,R.anim.translate_anim)
                binding.girlImage.startAnimation(animation)
            }
            binding.rotateButton.id -> {
                animation= AnimationUtils.loadAnimation(this,R.anim.rotate_anim)
                binding.girlImage.startAnimation(animation)
            }
        }
    }


}