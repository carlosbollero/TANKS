package com.android.tanks.model;

/**
 * Created by carlos on 11/05/15.
 */
public class DireccionSur implements Direccion {
    @Override
    public boolean esNorte() {
        return false;
    }

    @Override
    public boolean esSur() {
        return true;
    }

    @Override
    public boolean esEste() {
        return false;
    }

    @Override
    public boolean esOeste() {
        return false;
    }

    @Override
    public Posicion siguiente(Posicion posicion) {
        return new Posicion(posicion.getX(), posicion.getY() - 1);
    }
}
