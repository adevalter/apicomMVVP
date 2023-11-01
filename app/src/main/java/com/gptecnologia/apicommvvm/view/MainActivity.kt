package com.gptecnologia.apicommvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gptecnologia.apicommvvm.R
import com.gptecnologia.apicommvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate( layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}