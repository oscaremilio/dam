
/*
Programa que pide al usuario introducir una lista de nombres 
separados por espacios en blanco. El programa separa la cadena, 
y ordena los nombres alfabéticamente y los escribe separados por comas.
Por ejemplo, si el usuario escribe esta lista:
"Susan Kailey William John ", el programa debe escribir
"John, Kailey, Susan, William ".
*/

import java.util.Scanner;

public class Ejercicio_11_SortJoin {

    public static void main(String[] args) {

        // Se crea el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // El usuario introduce sus nombres
        System.out.print("Introduce una lista de nombres (separados por un espacio): ");
        String listaNombres = sc.nextLine();

        // Pasa los nombres a un array de cadenas
        String[] resultadoNombres = listaNombres.split(" ");

        // Ordenamiento de Burbuja ignorando las mayúsculas
        for (int i = 0; i < resultadoNombres.length; i++) {
            for (int j = 0; j < resultadoNombres.length - i - 1; j++) {
                if ( (resultadoNombres[j].toLowerCase().compareTo(resultadoNombres[j+1].toLowerCase()) ) > 0 ) {
                    String aux = resultadoNombres[j];
                    resultadoNombres[j] = resultadoNombres[j+1];
                    resultadoNombres[j+1] = aux;
                }
            }
        }

        // Imprime el array previamente ordenado
        for (int i = 0; i < resultadoNombres.length; i++) {
            System.out.print(resultadoNombres[i] + ", ");
        }   

        // Cierra el objeto Scanner
        sc.close();

    }
    
}
