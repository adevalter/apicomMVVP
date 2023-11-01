package com.gptecnologia.apicommvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gptecnologia.apicommvvm.model.Postagem
import com.gptecnologia.apicommvvm.model.PostagemApi
import kotlinx.coroutines.launch

class PostagemViewModel : ViewModel() {

    val listaPostagens = MutableLiveData<List<Postagem>>()

    fun recuperarPostagens(){
        val postagemApi = PostagemApi()
        viewModelScope.launch {
            val postagens = postagemApi.recuperarPostagens()
            listaPostagens.postValue(postagens)
        }
    }
}