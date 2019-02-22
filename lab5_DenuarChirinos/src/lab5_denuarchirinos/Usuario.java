/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_denuarchirinos;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Denuar
 */
public class Usuario {
    private String nombre, apellido, nombreU, contraseña;
    private Color colorFav;
    private Date fechaNac;
    private int nMazos;
    private double edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nombreU, String contraseña, Color colorFav, Date fechaNac, double edad, int nMazos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreU = nombreU;
        this.contraseña = contraseña;
        this.colorFav = colorFav;
        this.fechaNac = fechaNac;
        this.edad = edad;
        this.nMazos = nMazos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Color getColorFav() {
        return colorFav;
    }

    public void setColorFav(Color colorFav) {
        this.colorFav = colorFav;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public int getnMazos() {
        return nMazos;
    }

    public void setnMazos(int nMazos) {
        this.nMazos = nMazos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nombreU=" + nombreU + ", contrase\u00f1a=" + contraseña + ", colorFav=" + colorFav + ", fechaNac=" + fechaNac + ", edad=" + edad + ", nMazos=" + nMazos + '}';
    }
    
}
