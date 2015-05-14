package com.android.tanks.model;

import junit.framework.TestCase;

public class TanqueTest extends TestCase {
	
    Tanque tanque;


    public void eltanqueSePuedeMoverNorte() {
        tanque = new Tanque(new Posicion(1, 1));
        System.out.println(tanque.getPosicion().getX() + "," + tanque.getPosicion().getY());

        Posicion posIni = tanque.getPosicion();

        tanque.mover(new DireccionNorte());

        System.out.println(tanque.getPosicion().getX() + "," + tanque.getPosicion().getY());

        assertFalse(posIni.equals(tanque.getPosicion()));
        assertEquals(new Posicion(posIni.getX(), posIni.getY() + 1), tanque.getPosicion());

    }

}
