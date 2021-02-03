package com.example.cargandoserviciospost.Interfaz;

import com.example.cargandoserviciospost.Modelo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GsonApi {
    @GET("posts")
    Call<List<Modelo>> getPost();
}
