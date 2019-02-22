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
public class GiganteNoble extends Comun{
    private String velocidad="Media", objetivos="Terrestres";
    private int coste=6;

    public GiganteNoble() {
        super();
    }

    public GiganteNoble(String nombre, String daño, String ptosVida) {
        super(nombre, daño, ptosVida);
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }


    
}
