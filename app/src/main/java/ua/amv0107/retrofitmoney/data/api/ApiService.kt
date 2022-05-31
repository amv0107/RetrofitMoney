package ua.amv0107.retrofitmoney.data.api

import retrofit2.Response
import retrofit2.http.GET
import ua.amv0107.retrofitmoney.model.beznal.Beznal
import ua.amv0107.retrofitmoney.model.beznal.BeznalItem
import ua.amv0107.retrofitmoney.model.nal.Nalichka
import ua.amv0107.retrofitmoney.model.nal.NalichkaItem

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezMoneys(): Response<Beznal>
}