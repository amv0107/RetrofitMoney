package ua.amv0107.retrofitmoney.data.repository

import retrofit2.Response
import ua.amv0107.retrofitmoney.data.api.RetrofitInstance
import ua.amv0107.retrofitmoney.model.beznal.Beznal
import ua.amv0107.retrofitmoney.model.beznal.BeznalItem
import ua.amv0107.retrofitmoney.model.nal.Nalichka
import ua.amv0107.retrofitmoney.model.nal.NalichkaItem

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }
    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBezMoneys()
    }
}