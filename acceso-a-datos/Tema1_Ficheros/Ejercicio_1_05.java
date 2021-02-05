
/*
Programa que añade a un fichero ”log.txt” una nueva línea en cada ejecución,
que contendrá la fecha (en formato 19-09-2019), la hora (17:02:09) 
y el texto introducido por el usuario.
*/

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio_1_05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Solicita texto para introducir en el fichero
        System.out.print("Texto: ");
        String texto = entrada.nextLine();

        PrintWriter printWriter = null;

        // Obtiene la fecha y la hora actual en el formato deseado
        LocalDate hoy = LocalDate.now();
        String hoyFormateado = hoy.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalTime hora = LocalTime.now();
        String horaFormateada = hora.format(DateTimeFormatter.ofPattern("hh:mm:ss"));

        // Escribe en fichero sin borrar lo añadido anteriormente
        try {
            printWriter = new PrintWriter(new BufferedWriter (new FileWriter ("log.txt",true) ) );
            printWriter.println(hoyFormateado + " " + horaFormateada + " " + texto);
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

        entrada.close();

    }
    
}
