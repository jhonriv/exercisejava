/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jhonriv.exercisejava;

/**
 *
 * @author JhonRiv
 */
public class ExerciseJava {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Crear una funcion que sume 3 parametros:");
        System.out.println("La suma de 1 + 2 + 3 es: " + (int)SumNum(1, 2, 3));
        System.out.println("--------------------------------------------------------");
        System.out.println();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Crear una clase coche, con variable que almacene la cantidad de puertas, se pueda agregar y se pueda consultar la cantidad de puertas actuales:");
        System.out.println("Se crea la clase coche...");
        Coche coche = new Coche();
        System.out.println("Se agrega una puerta...");
        coche.addPuertas();
        System.out.println("Se consulta la cantidad de puertas...");
        System.out.println("Cantidad de puertas del coche: " + coche.getPuertas());
        System.out.println("--------------------------------------------------------");
    }
    
    static double SumNum(double x1, double x2, double x3) {
        return x1 + x2 + x3;
    }
}