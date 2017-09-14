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

    public Lamias(int aletas, int branquias) {
        this.aletas = aletas;
        this.branquias = branquias;
    }

    public Lamias(int aletas, int branquias, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud, Edad);
        this.aletas = aletas;
        this.branquias = branquias;
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
