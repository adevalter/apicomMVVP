package com.gptecnologia.apicommvvm.api

import com.gptecnologia.apicommvvm.model.Postagem
import retrofit2.Response
import retrofit2.http.GET

interface JsonPlaceApi {
    @GET("posts")
    suspend fun recuperarPostagens() : Response<List<Postagem>>
}