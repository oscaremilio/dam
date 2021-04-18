
/*
Programa que define una constante de tipo float llamada PI
con el valor de 3.14159.
El programa pide al usuario el radio de un círculo,
y visualizará el área (con 2 dígitos decimales) 
del círculo (PI * radio * radio).
*/

import java.util.Scanner;

public class Ejercicio_04_CircleArea {

    public static final float PI = 3.14159f;
    public static void main(String[] args) {
        
        int radio;
        float area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        radio = sc.nextInt();
        area = PI * radio * radio;

        System.out.printf("El área del círculo es %.2f", area);

        sc.close();
    }
}
