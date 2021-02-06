
/*
Programa que lee si existe un fichero llamado ”log.txt” 
mostrando por consola una línea por cada línea del fichero. 
Si el fichero no existe, preguntará al usuario un nombre de fichero 
y lo leerá como si fuera el log.txt siempre que exista
*/

import java.io.*;
import java.util.Scanner;

public class Ejercicio_1_05b {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
     
        // Comprueba si existe el fichero
        if ( (new File ("log.txt") ).exists() ) {

            // Si existe, intenta leer el fichero
            System.out.println("Leyendo fichero...\n");
            
            try {
                BufferedReader ficheroEntrada = new BufferedReader( new FileReader( new File("log.txt") ) );
                
                String linea = ficheroEntrada.readLine();

                // Lee el fichero línea a línea
                while (linea != null) {
                    System.out.println (linea);
                    linea = ficheroEntrada.readLine();
                }

                // Cierra
                ficheroEntrada.close();
            }
            // Captura y visualiza un posible error
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage() );
            }

            System.out.println("\nFin de lectura");

        }
        // Si no existe el fichero intenta leer otro elegido por el usuario
        else {
                System.out.print("Fichero a leer: ");
                String nombreFichero = entrada.nextLine() + ".txt";

                 // Comprueba si existe el fichero
                if ( !(new File (nombreFichero) ).exists() ) {
                    System.out.println("No he encontrado \"log.txt\"");
                    return;
                }

                // Si existe, intenta leer el fichero
            System.out.println("Leyendo fichero...\n");
            
            try {
                BufferedReader ficheroEntrada = new BufferedReader( new FileReader( new File(nombreFichero) ) );
                
                String linea = ficheroEntrada.readLine();

                // Lee el fichero línea a línea
                while (linea != null) {
                    System.out.println (linea);
                    linea = ficheroEntrada.readLine();
                }

                // Cierra
                ficheroEntrada.close();
            }
            // Captura y visualiza un posible error
            catch (IOException e) {
                System.out.println("Error: " + e.getMessage() );
            }

            // Avisa de que se ha acabado de leer el fichero
            System.out.println("\nFin de lectura");

        }
    }
} 
