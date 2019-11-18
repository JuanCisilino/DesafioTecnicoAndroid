package com.fluxit.desafiotecnicoandroid.model;

import android.widget.Toast;

import com.fluxit.desafiotecnicoandroid.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.widget.Toast.LENGTH_LONG;

public class PersonaDao extends RetrofitPersonaDao {

    public static final String BASE_URL = "https://randomuser.me/";

    public PersonaDao() {
        super(BASE_URL);
    }

    public void traerListaPersonas(final ResultListener<List<Persona>> listenerDelController){
        Call<ContenedorPersona> contenedorPersonaCall = servicePersona.PedidoListaDePersonas();

        contenedorPersonaCall.enqueue(new Callback<ContenedorPersona>() {
            @Override
            public void onResponse(Call<ContenedorPersona> call, Response<ContenedorPersona> response) {
                ContenedorPersona contenedorPersona = response.body();
                listenerDelController.finish(contenedorPersona.getResults());
            }

            @Override
            public void onFailure(Call<ContenedorPersona> call, Throwable t) {

            }
        });

    }
}
