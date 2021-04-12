/* 
Programa que convierte gramos a onzas.
Pide al usuario un peso en gramos(un número entero),
y mostrará el correspondiente peso en onzas(un número real),
teniendo en cuenta que 1 onza = 28.3495 gramos.
*/

import java.util.Scanner;

public class Ejercicio_2_GramOunceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu peso en gramos: ");
        int pesoGramos = sc.nextInt();

        System.out.printf("Tu peso en onzas es: %2.3f", (double)pesoGramos/28.3495);

        sc.close();

    }
}
