package com.fluxit.desafiotecnicoandroid.model;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable {

    private String gender;
    private Name name = new Name();
    private Picture picture = new Picture();

    public Persona() {
    }

    public Persona(String gender, Name name, Picture picture) {
        this.gender = gender;

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Name getName() {
        return name;
    }


    public Picture getPicture() {
        return picture;
    }


}
