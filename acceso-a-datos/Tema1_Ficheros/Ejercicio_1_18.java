import java.io.*;

/*
Programa que deserializa datos de personas tomados del fichero "personas.dat"
*/

public class Ejercicio_1_18 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Fichero que contiene los datos
        File fichero = new File("personas.dat");

        // Tipo de ficheros
        FileInputStream ficheroSalida = new FileInputStream(fichero);
        ObjectInputStream ficheroObjetos = new ObjectInputStream(ficheroSalida);

        Persona p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        p = (Persona) ficheroObjetos.readObject();
        p.escribir();

        ficheroObjetos.close();
    }

}
