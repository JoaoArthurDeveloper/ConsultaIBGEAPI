package br.com.fimmbrasil.consultaibgeapi.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.fimmbrasil.consultaibgeapi.R
import br.com.fimmbrasil.consultaibgeapi.models.ListaMesorregiao
import br.com.fimmbrasil.consultaibgeapi.models.Mesorregiao
import br.com.fimmbrasil.consultaibgeapi.service.IBGEService
import br.com.fimmbrasil.consultaibgeapi.service.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var ibgeService:IBGEService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibgeService = RetrofitConfig.getIBGEService()

        val listaibge = ibgeService.getAllMesorregioes()

//        listaibge.enqueue(ibgeCallbackHandler) //erro
    }

    private val ibgeCallbackHandler = object:Callback<ListaMesorregiao>{
        override fun onFailure(call: Call<ListaMesorregiao>, t: Throwable) {

        }

        override fun onResponse(call: Call<ListaMesorregiao>, response: Response<ListaMesorregiao>) {

        }

    }

}