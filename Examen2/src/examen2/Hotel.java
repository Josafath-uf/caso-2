/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author minil
 */
public class Hotel {
    private int pisos;
    private char [][] habitaciones;
    private String estados;
    
   

    public Hotel(int pisos, char[][] habitaciones, String estados) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.estados = estados;
    }

    public int getPisos() {
        return pisos;
    }

    public char[][] getHabitaciones() {
        return habitaciones;
    }

    public String getEstados() {
        return estados;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setHabitaciones(char[][] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Hotel{" + "pisos=" + pisos + ", habitaciones=" + habitaciones + ", estados=" + estados + '}';
    }
   
    
    
}
