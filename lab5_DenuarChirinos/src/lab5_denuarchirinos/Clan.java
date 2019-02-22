/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_denuarchirinos;

import java.util.ArrayList;

/**
 *
 * @author Denuar
 */
public class Clan {
    private String nombre;
    private ArrayList <Usuario> usuarios;

    public Clan() {
    }

    public Clan(String nombre, ArrayList<Usuario> usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
