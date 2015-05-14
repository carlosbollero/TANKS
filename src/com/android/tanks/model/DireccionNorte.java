package com.android.tanks.model;

/**
 * Created by carlos on 01/05/15.
 */
public class DireccionNorte implements Direccion {
    @Override
    public boolean esNorte() {
        return true;
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
        return false;
    }

    @Override
    public Posicion siguiente(Posicion posicion) {
        return new Posicion(posicion.getX(), posicion.getY() + 1);
    }
}
