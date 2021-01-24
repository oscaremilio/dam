import java.util.Scanner;

/*
Programa que pide al usuario un número entero y lo muestra como producto de sus factores primos, algo como: 24 = 2 * 2 * 2 * 3
*/

public class Ejercicio_0_2 {
    public static void main(String[] args) {
        
        int divisor = 2;
        int cantidad=0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un número: ");
        int numero = entrada.nextInt();
        
        System.out.println("Factores primos de " + numero + ": ");

        while(numero>1) {
            if (numero%divisor == 0) {
                System.out.print(divisor + " ");
                numero = numero/divisor;
                cantidad++;
            }
            if (numero%divisor != 0) {
                divisor++;
            }  
        }

        if (cantidad == 1) {
            System.out.println("es un número primo");
        }
    }
    
}
