import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Programa que escribe en un fichero ”rectangle.txt” 
un rectángulo hueco de asteriscos, 
del ancho y alto escogido por el usuario.
*/

public class Ejercicio_1_04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ancho: ");
        int ancho = entrada.nextInt();
        System.out.print("Alto: ");
        int alto = entrada.nextInt();

        // Crea un objeto PrintWriter sin referencia todavía
        PrintWriter printWriter = null;

        try {
            // Constructor que crea el fichero de texto o lo sobrescribe si ya existe
            printWriter = new PrintWriter("rectangle.txt");

            // Imprime un rectángulo con el alto y ancho escogido
            for (int i=1; i<=alto; i++) {

                for (int j=1; j<=ancho; j++) {
                    
                    // Imprime asterisco en línea superior e inferior
                    if (i==1 || i==alto) {
                    printWriter.print("*");
                    }
                    // Imprime asterisco en la primera y última posición
                    // las líneas interiores
                    else { 
                        if (j==1 || j == ancho-1) {
                            printWriter.print("*");
                        }
                    // Imprime espacio en las posiciones intermedias
                    // de las líneas interiores
                        if (j != 1 || j != ancho) {
                        printWriter.print(" ");
                        }
                    }
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