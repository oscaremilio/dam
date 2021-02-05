import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Crea un programa que escriba en un fichero ”triangle.txt” un triángulo
creciente de asteriscos, de alto escogido por el usuario.
*/

public class Ejercicio_1_03 {

    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Alto: ");
        int alto = entrada.nextInt();

        // Crea un objeto PrintWriter sin referencia todavía
        PrintWriter printWriter = null;

            // Constructor que crea el fichero de texto o lo sobrescribe si ya existe
            printWriter = new PrintWriter("triangle.txt");

            // Imprime un triángulo con el alto escogido
            for (int i=1; i<=alto; i++) {

                for (int j=1; j<=i; j++) {
                    // método para imprimir el tipo de dato usado
                    printWriter.print("*");
                }
                printWriter.println();
                
            }

        // Obliga a cerrar Scanner y printWriter
        printWriter.close();
        entrada.close();

    } 
    
}
