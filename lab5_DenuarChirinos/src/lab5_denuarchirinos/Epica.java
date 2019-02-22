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
public class Epica extends Carta{
    private String tipo = "Epica";

    public Epica() {
        super();
    }

    public Epica(String nombre, String daño, String ptosVida) {
        super(nombre, daño, ptosVida);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
