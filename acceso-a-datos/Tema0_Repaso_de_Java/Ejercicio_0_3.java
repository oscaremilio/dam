
import java.util.Scanner;

/*
Programa que pide al usuario un número del 1 al 12 y muestra el nombre del
correspondiente mes, usando un "switch".
*/

public class Ejercicio_0_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un número del 1 al 12: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                    System.out.print("Enero");
                    break;
            case 2:
                    System.out.print("Febrero");
                    break;
            case 3:
                    System.out.print("Marzo");
                    break;
            case 4:
                    System.out.print("Abril");
                    break;
            case 5:
                    System.out.print("Mayo");
                    break;
            case 6:
                    System.out.print("Junio");
                    break;
            case 7:
                    System.out.print("Julio");
                    break;
            case 8:
                    System.out.print("Agosto");
                    break;
            case 9:
                    System.out.print("Septiembre");
                    break;
            case 10:
                    System.out.print("Octubre");
                    break;
            case 11:
                    System.out.print("Noviembre");
                    break;
            case 12:
                    System.out.print("Diciembre");
                    break;
            default:
                    System.out.print("No has escrito lo que pedía");
            
        }
    }
}
