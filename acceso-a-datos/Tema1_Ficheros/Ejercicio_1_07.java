/*
Programa que pide al usuario el nombre de un fichero de texto 
y vuelca su contenido a otro fichero, pero invirtiendo el orden 
de las líneas (la última pasará a ser la primera, la penúltima será la segunda
y así sucesivamente).
*/

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio_1_07 {

    public static void main(String[] args) {

        // Crea un objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // Solicita texto para introducir en el fichero
        System.out.print("Introduce el nombre de un fichero de texto: ");
        String nombreFichero = entrada.nextLine()+".txt";

        // Crea un objeto PrintWriter sin referencia todavía
        PrintWriter printWriter = null;

        // Crea una lista enlazada
        LinkedList<String> datos = new LinkedList<String>();

        // Comprueba si existe el fichero
        if (!(new File(nombreFichero)).exists()) {
            System.out.println("No he encontrado \"" + nombreFichero + "\"");
            entrada.close();
            return;
        }

        // Si existe, intenta leer el fichero
        System.out.println("Leyendo fichero...\n");

        try {
            // Selecciona el fichero a leer
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(nombreFichero)));

            // Crea el fichero al que se vuelca de forma inversa todo el texto
            printWriter = new PrintWriter("Invertido" + nombreFichero);

            String linea = ficheroEntrada.readLine();

            // Lee el fichero línea a línea
            while (linea != null) {
                // Añade la línea a la lista enlazada
                datos.add(linea);
                linea = ficheroEntrada.readLine();
            }

            //Recorre la lista enlazada con un iterador desde el final 
            Iterator<String> it = datos.descendingIterator();

            // Mueve el iterador e imprime el contenido en el nuevo fichero
            while(it.hasNext()) {
                printWriter.print(it.next());
                // Salto de línea
                printWriter.println();
            }

            // Cierra
            ficheroEntrada.close();
        }

        // Captura y visualiza un posible error
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage() );
        }

         // Se asegura de cerrar PrintWriter
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

        // Confirma la lectura y volcado del fichero 
        System.out.println("\nFin de lectura. Contenido volcado a otro archivo.");

        // Cierra Scanner
        entrada.close();


    }   

}