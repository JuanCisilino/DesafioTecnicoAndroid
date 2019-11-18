package com.fluxit.desafiotecnicoandroid.controller;

import android.widget.Toast;

import com.fluxit.desafiotecnicoandroid.model.Persona;
import com.fluxit.desafiotecnicoandroid.model.PersonaDao;
import com.fluxit.desafiotecnicoandroid.utils.ResultListener;

import java.util.List;

public class ControllerPersona {

    public void traerListaDePersonas(final ResultListener<List<Persona>> listenerDeLaVista){
        PersonaDao personaDao = new PersonaDao();

        personaDao.traerListaPersonas(new ResultListener<List<Persona>>() {
            @Override
            public void finish(List<Persona> result) {
                if (result != null) {
                    listenerDeLaVista.finish(result);
                }
            }
        });
    }
}
