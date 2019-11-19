package com.fluxit.desafiotecnicoandroid.model;

import java.io.Serializable;

public class Picture implements Serializable {

    private String thumbnail;

    public Picture() {
    }

    public Picture(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
