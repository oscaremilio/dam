
/*
Programa que pide al usuario escribir un peso (en gramos) 
y un volumen (en litros). El programa debe imprimir la densidad, 
que es calculada por la división peso / volumen.
El programa debe atrapar cada tipo posible de excepción:
NumberFormatException y ArithmeticException siempre que se pueda lanzar.
Sólo puedes usar el método Scanner.nextLine para obtener la entrada del usuario en este ejercicio.
*/

// Importa la librería Scanner
import java.util.Scanner;

public class Ejercicio_16_CalculateDensity {
    public static void main(String[] args) {
    
      // Bloque de código a ejecutar
      try {
        // Variables a usar
        int peso, volumen, densidad;

        // Crea un objeto Scanner
        Scanner sc = new Scanner(System.in);
      
        // Pide los datos al usuario
        System.out.print("Introduce un peso (en gramos): ");
        peso = Integer.parseInt( sc.nextLine() );
        System.out.print("Introduce un volumen (en litros): ");
        volumen = Integer.parseInt( sc.nextLine() );

        // Calcula el resultado
        densidad = peso / volumen;

        // Imprime el resultado
        System.out.println("La densidad es " + densidad + " g/L");

        // Cierra el objeto Scanner
        sc.close();
      } 
      
      // Errores posibles en el bloque 'try' que queremos capturar
      catch (NumberFormatException e){ // Formato introducido erróneo
        System.out.println("Error: " + e.getMessage());
      } 

      catch (ArithmeticException e) { // División por cero en este caso
        System.out.println("Error: " + e.getMessage());
      }
    
    }

}
