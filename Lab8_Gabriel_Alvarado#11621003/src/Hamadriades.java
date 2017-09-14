/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Hamadriades extends Hadas {
  private float arbol ;

    public Hamadriades() {
        super();
    }

    public Hamadriades(float saludArbol, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud+saludArbol, Edad);
        
    }

    public float getArbol() {
        return arbol;
    }

    public void setArbol(float arbol) {
        this.arbol = arbol;
    }

    @Override
    public String toString() {
        return "Hamadriades{" + "arbol=" + arbol + '}';
    }
   
    
    
    
    
    
    
    
    
}
