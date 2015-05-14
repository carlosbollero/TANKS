package com.android.tanks.model;

/**
 * Created by carlos on 01/05/15.
 */
public interface Direccion {

    public boolean esNorte();
    public boolean esSur();
    public boolean esEste();
    public boolean esOeste();

    public Posicion siguiente(Posicion posicion);
}
