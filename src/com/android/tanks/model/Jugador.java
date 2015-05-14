package com.android.tanks.model;

/**
 * Created by carlos on 27/04/15.
 */
public class Jugador {

    private String nombre;
    private int puntaje;
    //private Vida vidas;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public void aumentarPuntaje(int cantidad){
        puntaje += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
