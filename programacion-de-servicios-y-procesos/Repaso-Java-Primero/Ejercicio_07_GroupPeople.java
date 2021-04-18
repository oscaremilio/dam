
/*
Programa que pide al usuario introducir cuanta gente va a asistir
a una conferencia.
El programa debe crear grupos de (preferiblemente) 50 personas.
Cuando no sea posible, intentará crear grupos de 10 personas,
y finalmente creará grupos de 1 persona.
El programa imprimirá por pantalla cuantos grupos de cada categoría
son necesarios.
Por ejemplo, si 78 personas asistirán a la conferencia,
entonces necesitaremos 1 grupo de 50 personas,
2 grupos de 10 personas,
y 8 grupos de 1 persona.
*/

import java.util.Scanner;

public class Ejercicio_7_GroupPeople {
    
    public static void main(String[] args) {

        int cantidadGrupos = 0, tipoGrupos = 50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de asistentes: ");
        int asistentes = sc.nextInt(); 

        System.out.println("Grupos a crear en la conferencia: ");

        if (asistentes == 0) {
            System.out.println("¡El aforo está vacío!");
        }

        while (asistentes >= 1){
    
            if (asistentes < 50) {
                tipoGrupos = 10;
            }
        
            if (asistentes < 10) {
                tipoGrupos = 1;
            }

            cantidadGrupos = asistentes / tipoGrupos;
            System.out.println(cantidadGrupos + " de " + tipoGrupos + " asistente/s");
            asistentes = asistentes % tipoGrupos;
        }
        
        sc.close();

    }

}
