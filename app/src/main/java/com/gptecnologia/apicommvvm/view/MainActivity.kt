package com.gptecnologia.apicommvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gptecnologia.apicommvvm.R
import com.gptecnologia.apicommvvm.databinding.ActivityMainBinding
import com.gptecnologia.apicommvvm.viewmodel.PostagemViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate( layoutInflater)
    }

    private lateinit var  mainViewModel: PostagemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(PostagemViewModel::class.java)
        mainViewModel.listaPostagens.observe(this){listaPostagens ->
            var listaResultado = ""
            listaPostagens.forEach {postagem ->
                listaResultado = " (${postagem.id}) ${postagem.title} \n"

            }
            binding.textResultado.text = listaResultado

        }
    }

    override fun onStart() {
        super.onStart()
        mainViewModel.recuperarPostagens()
    }
}