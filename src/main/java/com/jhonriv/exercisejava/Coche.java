/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jhonriv.exercisejava;

/**
 *
 * @author JhonRiv
 */
public class Coche {
    private int cantidadPuertas = 0;

    public void addPuertas(){
        this.cantidadPuertas++;
    }
    
    public int getPuertas(){
        return this.cantidadPuertas;
    }
}
