
/*
Programa que pide al usuario introducir 2 matrices bidimensionales
de 3 filas y columnas, y después imprime el resultado de sumar ambas matrices.
Para sumar 2 matrices, se hará sumando los elementos 
que ocupan la misma posición en cada matriz.
*/

import java.util.Scanner;

public class Ejercicio_09_MatrixAddition {

    public static void main(String[] args) {

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizSuma = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos de la matriz A...");
        
        for (int i = 0; i < matrizA.length; i++) {           
            for (int j=0; j < matrizA[i].length; j++) {
                System.out.print("A[" + i + ", " + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("\nIntroduce los datos de la matriz B...");
        
        for (int i = 0; i < matrizB.length; i++) {           
            for (int j=0; j < matrizB[i].length; j++) {
                System.out.print("B[" + i + ", " + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz A");
        for (int i = 0; i < matrizA.length; i++) {  
            System.out.println();         
            for (int j=0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
        }

        System.out.println();

        System.out.println("\nMatriz B");
        for (int i = 0; i < matrizB.length; i++) {  
            System.out.println();         
            for (int j=0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
        }

        for (int i = 0; i < matrizSuma.length; i++) {  
            System.out.println();         
            for (int j=0; j < matrizSuma[i].length; j++) {
               matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nLa suma de ambas matrices es: ");
        
        for (int i = 0; i < matrizSuma.length; i++) {  
            System.out.println();         
            for (int j=0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
        }

        sc.close();

    }
    
}
