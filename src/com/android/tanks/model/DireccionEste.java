package com.android.tanks.model;

/**
 * Created by carlos on 11/05/15.
 */
public class DireccionEste implements Direccion {
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
        return true;
    }

    @Override
    public boolean esOeste() {
        return false;
    }

    @Override
    public Posicion siguiente(Posicion posicion) {
        return new Posicion(posicion.getX() + 1, posicion.getY());
    }
}
