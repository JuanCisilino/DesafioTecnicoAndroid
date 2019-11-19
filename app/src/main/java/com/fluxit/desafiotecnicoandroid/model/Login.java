package com.fluxit.desafiotecnicoandroid.model;

import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("username")
    private String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
