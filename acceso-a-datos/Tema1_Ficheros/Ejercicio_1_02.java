import java.io.IOException;
import java.io.PrintWriter;

/*
Crea un programa que escriba los números impares del 1 al 10 en un fichero 
de texto, cada uno en una línea.
*/


public class Ejercicio_1_02 {

    public static void main(String[] args) {

        // Crea un objeto PrintWriter sin referencia todavía
        PrintWriter printWriter = null;
        
        try {
            // Constructor que crea el fichero de texto o lo sobrescribe si ya existe
            printWriter = new PrintWriter("impares.txt");
         
            // Imprime cada número impar entre 1 y 10
            for (int i=1; i<=10; i++) {
                if (i % 2 != 0) {
                    // método para imprimir el tipo de dato usado
                    printWriter.println(i);
                }    
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

    } 

}
