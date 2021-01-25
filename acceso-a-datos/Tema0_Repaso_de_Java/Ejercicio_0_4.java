
import java.util.Scanner;

/*
Programa que pide al usuario un número del 1 al 12 y muestra el nombre del
correspondiente mes, usando un array de cadenas de texto en el que estarán
almacenados dichos nombres.
*/

public class Ejercicio_0_4 {
    public static void main(String[] args) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
                          "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
                          "Noviembre", "Diciembre"};

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un número del 1 al 12: ");
        int numero = entrada.nextInt();

        if(numero>=1 && numero<=12)
            System.out.println(meses[numero-1]);
        else
            System.out.print("Debías haber escrito un número entre 1 y 12");

        entrada.close();
    }
}