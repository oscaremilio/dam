import java.util.Scanner;

/*
Pide al usuario un número entero y di si es (o no) un palíndromo primo, con la ayuda de dos funciones booleanas “esPrimo” y “esPalindromo”.
*/

public class Ejercicio_0_5 {

    static int numero;

    public static boolean esPrimo(int num) {
        num = numero;
        int contador = 0;
        boolean esCierto = false;
    
        for (int divisor=2; divisor<=numero; divisor++) {
            if(numero%divisor==0) {
                contador++;
            }
        }
    
        if(contador == 1) {
            esCierto = true;
        }
    
        return esCierto;
    }
    
    public static boolean esPalindromo(int num) {
        int N, aux, inverso = 0, cifra;
        boolean esCorrecto = false;

        num = numero;
        N = num;
        aux = N;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (N == inverso) {
            esCorrecto = true;
        }

        return esCorrecto;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = entrada.nextInt();
        
        if( esPrimo(numero) && esPalindromo(numero)) {
            System.out.println("El número es un primo palíndromo");
        } else {
            System.out.println("El número no es un primo palíndromo");

        }
        
        entrada.close();
    }

}
