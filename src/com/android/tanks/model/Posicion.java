package com.android.tanks.model;

/**
 * Created by carlos on 01/05/15.
 */
public class Posicion {

    private int x;
    private int y;

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public  int getY(){
        return y;
    }

    @Override
      public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posicion)) return false;

        Posicion posicion = (Posicion) o;

        if (x != posicion.x) return false;
        if (y != posicion.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
