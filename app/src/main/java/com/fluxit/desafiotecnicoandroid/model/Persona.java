package com.fluxit.desafiotecnicoandroid.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable {

    private String email;
    private Name name = new Name();
    private Picture picture = new Picture();
    @SerializedName("dob")
    private Dob edad;

    public Persona() {
    }

    public Persona(String email, Name name, Picture picture) {
        this.email = email;

    }

    public Dob getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }


    public Name getName() {
        return name;
    }


    public Picture getPicture() {
        return picture;
    }


}
