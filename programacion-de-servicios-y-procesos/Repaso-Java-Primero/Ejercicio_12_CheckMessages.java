
/*
Programa que pide al usuario introducir 10 cadenas.
El programa las almacena en un array,
y cambia el texto "Eclipse" con "NetBeans" en cada cadena que
contiene "Eclipse".
El programa debe imprimir la version adaptada de las cadenas almacenadas 
en el array, tras haber realizado el cambio.
*/

// Importa la clase Scanner del paquete java.util
import java.util.Scanner;

public class Ejercicio_12_CheckMessages {
    public static void main(String[] args) {
        // Crea el array para almacenar las cadenas del usuario
        String[] cadenas = new String[10];
        // Y el array al que irán los cambios
        String[] cadenasCambiadas = new String[10];

        // Crea el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Captura en un array los datos introducidos por el usuario
        System.out.println("--Introduce 10 cadenas de texto--");
        for (int i = 0; i < 10; i++) {
            System.out.print("Cadena " + (i+1) + ": ");
            cadenas[i] = sc.nextLine();
        }

        // Cambia el texto "Eclipse" (si existe) por el texto "NetBeans"
        for (int i = 0; i < 10; i++) {
            if ( cadenas[i].contains("Eclipse") ) {
                cadenasCambiadas[i] = cadenas[i].replace("Eclipse", "NetBeans");
            }
            else { // Si no esta el texto "Eclipse", queda el texto original
                cadenasCambiadas[i] = cadenas[i];
            }
        }

        System.out.println("\n--Cadenas cambiadas--");

        // Imprime el array cambiado
        for (int i = 0; i < 10; i++) {
            System.out.println("Cadena " + (i+1) + ": " + cadenasCambiadas[i]);
        }

        // Cierra el objeto Scanner
        sc.close();
        
    }
}
