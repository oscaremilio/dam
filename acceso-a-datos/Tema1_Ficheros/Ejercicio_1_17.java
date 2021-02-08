
/*
Programa que serialice datos de personas (nombre, e-mail, fecha de nacimiento)
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Clase "Persona" que implementa la interfaz "Serializable"
class Persona implements Serializable {
    // Verifica la compatibilidad de emisor y receptor del objeto
    private static final long serialVersionUID = 1L;
    
    // Atributos
    protected String nombre;
    protected String email;
    protected String fechaNacimiento;

    // Constructor
    public Persona(String nom, String ema, String fec) {
        nombre = nom;
        email = ema;
        fechaNacimiento = fec;
    }

    // Método
    public void escribir() {
        System.out.println(nombre + ": " + email + ": " + fechaNacimiento);
    }

}

public class Ejercicio_1_17 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Fichero que contendrá los datos
        File fichero = new File("personas.dat");

        // Tipo de ficheros
        FileOutputStream ficheroSalida = new FileOutputStream(fichero);
        ObjectOutputStream ficheroObjetos = new ObjectOutputStream(ficheroSalida);

        // Objetos a guardar
        Persona p = new Persona("Juan López", "juan@hotmail.es", "23/07/1976");
        ficheroObjetos.writeObject(p);
        
        p = new Persona("Pedro Mayor", "pedrete@yahoo.es", "2/03/1995");
        ficheroObjetos.writeObject(p);

        p = new Persona("Lola Ayuso", "lol@gmail.com", "11/12/1980");
        ficheroObjetos.writeObject(p);  
        
        // Cierra
        ficheroObjetos.close();
        
    }
}