
/*
Programa que pide al usuario que introduzca 3 notas,
imprimiendo un mensaje, dependiendo de los valores introducidos, de entre los siguientes:
- "Todas las notas son mayores o iguales que 4"
- "Algunas notas no son mayores o iguales que 4"
- "Ninguna nota es mayor o igual que 4"
 * 
*/

import java.util.Scanner;

public class Ejercicio_5_MarkCheck {
    
    public static void main(String[] args) {

        int nota1, nota2, nota3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 3 notas (separadas por un espacio): ");
   
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();    
    
        if ( (nota1 >=4 ) && (nota2 >= 4) && (nota3 >= 4) ) {
            System.out.println("Todas las notas son mayores o iguales que 4");
        } else if ( !(nota1 >=4 ) && !(nota2 >= 4) && !(nota3 >= 4) ) {
            System.out.println("Ninguna nota es mayor o igual que 4");
        } else {
            System.out.println("Algunas notas no son mayores o iguales que 4");
        }

        sc.close();

    }

}
