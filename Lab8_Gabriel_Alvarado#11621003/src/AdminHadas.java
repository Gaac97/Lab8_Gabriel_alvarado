
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class AdminHadas implements Serializable {
     private ArrayList<Hadas> ListHadas = new ArrayList();
    private File archivo = null;

    public AdminHadas() {
    }

    public AdminHadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hadas> getListaHadas() {
        return ListHadas;
    }

    public void setListaHadas(ArrayList<Hadas> listaHadas) {
        this.ListHadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setHada(Hadas hada) {
        ListHadas.add(hada);
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas t : ListHadas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivo() {//pasar del rom al ram!
        try {
            ListHadas = new ArrayList();

            Hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);

                try {
                    while ((temp = (Hadas) objeto.readObject()) != null) {
                        ListHadas.add(temp);
                    }
                } catch (EOFException e) {
                   
                
                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
