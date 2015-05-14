package com.android.tanks.model;

/**
 * Created by carlos on 11/05/15.
 */
public class DireccionOeste implements Direccion {
    @Override
    public boolean esNorte() {
        return false;
    }

    @Override
    public boolean esSur() {
        return false;
    }

    @Override
    public boolean esEste() {
        return false;
    }

    @Override
    public boolean esOeste() {
        return true;
    }

    @Override
    public Posicion siguiente(Posicion posicion) {
        return new Posicion(posicion.getX() - 1, posicion.getY());
    }
}
