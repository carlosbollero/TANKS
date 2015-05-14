package com.android.tanks.model;

/**
 * Created by carlos on 27/04/15.
 */
public class Tanque {

    private Posicion posicion;
    private Salud salud;
    private Arma arma;
    private Blindaje blindaje;

    public Tanque(Posicion posicion) {
        this.posicion = posicion;
    }

    public void mover(Direccion direccion){
        posicion = direccion.siguiente(posicion);
    }

    public Posicion getPosicion() {
        return posicion;
    }
}
