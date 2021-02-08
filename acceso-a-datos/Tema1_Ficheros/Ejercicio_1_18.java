/*
Programa que deserializa datos de personas tomados del fichero "personas.dat"
La clase Persona está creada en 'Ejercicio 1.7'.
*/

import java.io.*;
import java.lang.ClassNotFoundException;

public class Ejercicio_1_18 {

        // Lanza posibles errores
        public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Fichero que contiene los datos
        File fichero = new File("personas.dat");

        // Tipo de ficheros
        FileInputStream ficheroSalida = new FileInputStream(fichero);
        ObjectInputStream ficheroObjetos = new ObjectInputStream(ficheroSalida);

        // Objetos a leer
        Persona p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        // Cierra
        ficheroObjetos.close();
    }

}
