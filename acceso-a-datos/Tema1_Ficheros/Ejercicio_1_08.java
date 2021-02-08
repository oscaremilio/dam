
/*
Programa que pide al usuario el nombre de un fichero de texto
y muestra en consola la cantidad (total) de vocales que contiene.
*/

import java.util.Scanner;
import java.io.*;

public class Ejercicio_1_08 {
    
    public static void main(String[] args) {

        // Variable para sumar las vocales totales
        int contador = 0;

        // Pide al usuario un fichero
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre de un fichero de texto: ");
        String nombreArchivo = entrada.nextLine() + ".txt";

        // Intenta leer el fichero
        try {
            FileInputStream ficheroEntrada = new FileInputStream (new File(nombreArchivo));

            int dato = ficheroEntrada.read();

            /* 
            Comprueba que haya vocales (escrito en código ASCII)
            Analiza únicamente las vocales minúsculas, exceptuando las vocales mayúsculas y las acentuadas
            */
            while (dato != -1) {
                if (dato == 97 || dato == 101 || dato == 105 || dato == 111 || dato == 117 ) {
                    contador++;
                }
                dato = ficheroEntrada.read();
            }

            // Cierra fichero
            ficheroEntrada.close();
        }
        
        // Captura y visualiza un posible error
        catch (Exception errorFichero) {
            System.out.println("Se ha producido un problema: " + errorFichero.getMessage());  
        }

        // Muestra el contador actualizado si había vocales en el fichero 
        System.out.println("Cantidad (total) de vocales en el fichero: " + contador);

        entrada.close();

    }

}