/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_denuarchirinos;

/**
 *
 * @author Denuar
 */
public class Carta {
    private String nombre, daño, ptosVida;

    public Carta() {
    }

    public Carta(String nombre, String daño, String ptosVida) {
        this.nombre = nombre;
        this.daño = daño;
        this.ptosVida = ptosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }

    public String getPtosVida() {
        return ptosVida;
    }

    public void setPtosVida(String ptosVida) {
        this.ptosVida = ptosVida;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", ptosVida=" + ptosVida + '}';
    }
    
    
}
