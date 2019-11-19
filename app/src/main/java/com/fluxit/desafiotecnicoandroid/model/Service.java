package com.fluxit.desafiotecnicoandroid.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("?results=20")
    Call<ContenedorPersona> PedidoListaDePersonas();
}
