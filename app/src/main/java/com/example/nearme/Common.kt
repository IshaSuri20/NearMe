package com.example.nearme

import com.example.nearme.Model.Results
import com.example.nearme.Remote.IGoogleAPIService
import com.example.nearme.Remote.RetrofitClient


object Common {
    var currentResult: Results? = null

    private val GOOGLE_API_URL="https://maps.googleapis.com/"
    val googleApiService:IGoogleAPIService
    get()=RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}