
/*
Programa que muestra en pantalla el texto:
"Dime tu nombre: ", y después, en la misma línea, lee el nombre del usuario,
que puede contener espacios. Entonces, escribe 5 veces "Hola", seguido del nombre del usuario, en 5 líneas distintas.
*/

import java.util.Scanner;

public class Ejercicio_0_1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        String nombre = entrada.nextLine();

        for(int i=1; i<=5; i++){
            System.out.println("Hola " + nombre);
        }

        entrada.close();

    }


}