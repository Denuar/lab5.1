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
public class Mazos {
    private ArrayList cartas;
    private double coste=0;

    public Mazos() {
    }

    public Mazos(ArrayList cartas, double coste) {
        this.cartas = cartas;
        this.coste = coste;
    }

    public ArrayList getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList cartas) {
        this.cartas = cartas;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
        
    public void coste(){
        int cont=0;
        for (int i = 0; i < cartas.size(); i++) {
            if (cartas.get(i) instanceof MiniPekka || cartas.get(i) instanceof MontaPuerco || 
                    cartas.get(i) instanceof Leñador || cartas.get(i) instanceof DragonInfernal ||
                    cartas.get(i) instanceof Dragon){
                coste+=4;
                cont++;
            }
            else if (cartas.get(i) instanceof Golem){
                coste+=8;
                cont++;
            }
            else if (cartas.get(i) instanceof GiganteNoble){
                coste+=6;
                cont++;
            }
            else if (cartas.get(i) instanceof PandillaDuendes){
                coste+=3;
                cont++;
            }
        }
        coste=coste/cont;
    }
}

