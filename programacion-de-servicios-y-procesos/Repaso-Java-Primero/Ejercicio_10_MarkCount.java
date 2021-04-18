
/*
Programa que pide al usuario introducir 10 notas (enteros entre 0 y 10).
El programa debe imprimir cuantas notas de cada tipo se han introducido.
Por ejemplo, si el usuario introduce la nota "7" en 3 ocasiones, 
el programa escribirá:
"7: 3 nota/s."
*/

import java.util.Scanner;

public class Ejercicio_10_MarkCount {
    public static void main(String[] args) {
        
        int[] notas = new int[10];
        int contador = 1, cantidad=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 notas: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i+1) + ": " + " ");
            notas[i] = sc.nextInt();
        }

        System.out.println("\nVeces que has introducido cada nota");

        while (contador <= 10)  {
            for (int i=0; i < notas.length; i++ ) {
                if (notas[i] == contador) {
                    cantidad++;
                }
            }
            System.out.println(contador + ": " + cantidad + " nota/s");
            contador++;
            cantidad = 0;
        }
    }
}
