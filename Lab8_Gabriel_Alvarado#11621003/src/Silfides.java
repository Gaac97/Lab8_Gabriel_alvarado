
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Silfides extends Hadas{
  private int alas;

    public Silfides() {
        super();
    }

    public Silfides(int alas, String nombre, float estatura, float poder, float salud, int Edad) {
        super(nombre, estatura, poder, salud, Edad);
        this.alas = alas;
    }

    

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        if (alas<= 6){
        this.alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "6 o menos");
        }
    }

    @Override
    public String toString() {
        return "Silfides{" + "alas=" + alas ;
    }

}
