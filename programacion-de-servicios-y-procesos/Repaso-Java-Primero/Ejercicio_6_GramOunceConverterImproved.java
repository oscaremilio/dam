/* 
Programa que pide al usuario el peso (float),
y una unidad ("g" para gramos, "o" para onzas).
Dependiendo de la unidad elegida, el programa
convertirá el peso a la unidad opuesta, por ejemplo,
para un peso de 33 o el programa convertirá 33 onzas
a gramos, teniendo en cuenta que 1 onza = 28.3495 gramos.
Se usa una instrucción "switch". Si la unidad no es
"g" ni "o", el programa imprime un mensaje de error:
"Unidad inesperada", y no imprime ningún resultado.
*/

import java.util.Scanner;

public class Ejercicio_6_GramOunceConverterImproved {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu peso: ");
        float peso = sc.nextFloat();
        System.out.print("Unidad de masa (\'o\' para onzas y \'g\' para gramos): ");
        char unidad = sc.next().charAt(0); 

        switch(unidad) {
            case 'g': System.out.printf("Tu peso en onzas es: %2.4f", peso/28.3495f);
            break;
            case 'o': System.out.printf("Tu peso en gramos es: %2.4f", peso*28.3495f);; break;
            default: System.out.println("¡Unidad inesperada!");
        }

        sc.close();

    }
}
