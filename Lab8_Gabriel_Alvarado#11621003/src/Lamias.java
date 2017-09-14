/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Lamias extends Hadas{
    private int aletas;
    private int branquias;
    

    public Lamias(String nombre, int altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return "Lamias{" + "aletas=" + aletas + ", branquias=" + branquias + '}';
    }

    

    
    
    
}
