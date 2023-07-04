/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edensilvestre
 */
 public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puerta(s).");
        SumaNumeros SumaNumeros = new SumaNumeros();
        int resultado = SumaNumeros.sumar(2, 3, 5);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
