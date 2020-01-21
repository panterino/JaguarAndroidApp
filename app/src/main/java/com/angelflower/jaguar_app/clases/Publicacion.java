package com.angelflower.jaguar_app.clases;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class Publicacion {

    private String titulo;
    private String usuario;
    private String imagen;

    public Publicacion(){

    }

    public Publicacion(String titulo, String usuario, String imagen) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}