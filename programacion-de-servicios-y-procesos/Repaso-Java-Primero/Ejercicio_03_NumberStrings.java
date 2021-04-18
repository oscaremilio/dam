/*
Programa que pide al usuario 4 números,
que se almacenarán en 4 variables String.
El programa unirá los dos primeros números en un número entero,
y los dos últimos en otro número entero, y los sumará.
Por ejemplo, para 23, 11, 45, 112, el programa crea 2311 y 45112
y obtiene un resultado de 47423.
*/

import java.util.Scanner;

public class Ejercicio_3_NumberStrings {
    public static void main(String[] args) {

        int numero1, numero2, numero3, numero4, union1y2, union3y4;

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Introduce 4 números enteros (separados por espacios): ");

        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        numero4 = sc.nextInt();

        String provisionalUnion1y2 = "" + numero1 + numero2;
        String provisionalUnion3y4 = "" + numero3 + numero4;

        union1y2 = Integer.parseInt(provisionalUnion1y2);
        union3y4 = Integer.parseInt(provisionalUnion3y4);

        System.out.println("Unimos " + numero1 + " y " + numero2 + " = " + union1y2);
        System.out.println("Unimos " + numero3 + " y " + numero4 + " = " + union3y4);
        System.out.println("Sumamos " + union1y2 + " + " + union3y4 + " = " + (union1y2 + union3y4));
    }
}
