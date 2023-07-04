/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edensilvestre
 */
public class Coche {
    private int numPuertas;
     public Coche() {
        numPuertas = 0;
    }
     public void incrementarPuertas() {
        numPuertas++;
    }
     public int getNumPuertas() {
        return numPuertas;
    }
}