package com.fluxit.desafiotecnicoandroid.model;

import java.io.Serializable;
import java.util.List;

public class Persona implements Serializable {

    private String gender;
    private List<Persona> name;
    private List<Persona> location;
    private String email;
    private List<Persona> id;
    private List<Persona> picture;
    private String nat;


    public Persona() {
    }

    public Persona(String gender, List<Persona> name, List<Persona> location, String email, List<Persona> id, List<Persona> picture, String nat) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.id = id;
        this.picture = picture;
        this.nat = nat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Persona> getName() {
        return name;
    }

    public void setName(List<Persona> name) {
        this.name = name;
    }

    public List<Persona> getLocation() {
        return location;
    }

    public void setLocation(List<Persona> location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Persona> getId() {
        return id;
    }

    public void setId(List<Persona> id) {
        this.id = id;
    }

    public List<Persona> getPicture() {
        return picture;
    }

    public void setPicture(List<Persona> picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
}
