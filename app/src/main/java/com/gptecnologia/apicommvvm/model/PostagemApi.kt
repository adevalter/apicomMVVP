package com.gptecnologia.apicommvvm.model


import com.gptecnologia.apicommvvm.api.RetrofitService
import retrofit2.Response

class PostagemApi {
    suspend fun recuperarPostagens() : List<Postagem>{

        val jsonPlace = RetrofitService.recuperarJsonPlace()
        var retorno: Response<List<Postagem>>? = null
        try {
            retorno = jsonPlace.recuperarPostagens()
            if(retorno.isSuccessful){
                retorno.body()?.let{ postagens->
                    return postagens

                }
            }

        }catch (erroRecuperarPostagem: Exception){
            erroRecuperarPostagem.printStackTrace()
        }

        return emptyList()
    }
}