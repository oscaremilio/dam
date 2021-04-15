
/*
Programa que pide al usuario números (de tipo entero)
hasta que introduce el número 0.
El programa sumará todos los números introducidos
y mostrará el resultado final, y cuantos dígito tiene. 
Por ejemplo, si el usuario escribe 12, 20, 60, 33, 99 and 0,
la salida del programa será : "El resultado es 224, y este tiene 3 dígitos".
*/

import java.util.Scanner;

public class Ejercicio_8_SumDigits {
    public static void main(String[] args) {

        int numero=0, suma = 0, digito = 0, total=0;

        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            suma = numero + suma;
        } while(numero != 0);
        
        total = suma; 

        while(total > 0){
            total = total / 10;
            digito++;
        }

        if (suma > 0) {
            System.out.println("El resultado es " + suma + ", y este resultado tiene " + digito + " dígito/s");
        } 
        else {
            System.out.println("No has introducido números para sumar."); 
        }

        sc.close();
    }
}
