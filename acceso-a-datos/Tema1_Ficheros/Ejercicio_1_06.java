
/*
Programa que pide al usuario la cantidad de filas y de columnas 
y crea en un fichero llamado "rectangulo.txt" un rectángulo 
de asteriscos de ese tamaño
*/

import java.io.*;
import java.util.Scanner;

public class Ejercicio_1_06 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Columnas: ");
        int columnas = entrada.nextInt();
        System.out.print("Filas: ");
        int filas = entrada.nextInt();

        // Crea un objeto PrintWriter sin referencia todavía
        PrintWriter printWriter = null;

        try {
            // Constructor que crea el fichero de texto o lo sobrescribe si ya existe
            printWriter = new PrintWriter("rectangulo.txt");

            // Imprime un rectángulo con las filas y las columnas introducidas
            for (int i=1; i<=filas; i++) {

                for (int j=1; j<=columnas; j++) {
                    printWriter.print("*");
                }
                // Salto de línea
                printWriter.println();
                
            }
        }

        // Captura cualquier excepción de Entrada/Salida
        catch (IOException e) {
            e.printStackTrace();
        }

        // Se asegura de cerrar el objeto PrintWriter
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
        // Cierra 
        entrada.close();

    }   

}
