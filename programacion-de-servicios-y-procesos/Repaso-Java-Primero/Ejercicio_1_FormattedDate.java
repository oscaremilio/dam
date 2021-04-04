import java.util.Scanner;

/*
Programa que pide al usuario el día, mes, y año de nacimiento(todos valores enteros). Tras ello imprime la fecha de nacimiento con el formato dd/mm/yyyy.
*/

class Ejercicio_1_FormattedDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Día de nacimiento: ");
        int day = sc.nextInt();
        System.out.print("Mes de nacimiento: ");
        int month = sc.nextInt();
        System.out.print("Año de nacimiento: ");
        int year = sc.nextInt();

        System.out.printf("Tu fecha de nacimiento es %02d/%02d/%04d", day, month, year);

        sc.close();
    }
}
