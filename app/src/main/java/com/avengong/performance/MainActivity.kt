package com.avengong.performance

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.avengong.performance.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnMain.setOnClickListener {
            startActivity(Intent(this,LeakActivity::class.java))
        }

    }
}

