
/*
Programa con una función llamada "countString".
Esta función tendrá como parámetros dos cadenas "a" y "b", 
y un entero "n" como parámetros,
y devolverá un booleano indicando si la cadena "b" está contenida
como mínimo "n" veces en la cadena principal "a".
Pruebalo con:
cadena a = "This string is just a sample string", 
subcadena b = "string",
número n = 2.
El resultado de este ejemplo devuelto debería ser "true".
*/



public class Ejercicio_15_CountOcurrences {

    // Valores a usar en la función main y en la función "countString"
    static String a = "This string is just a sample string";
    static String b = "string";
    static int n = 2;

    // Función "countString"
    public static boolean countString(String cadenaA, String cadenaB, int numero) {
        // Inicializamos las variables necesarias
        boolean estaContenido = false;
        int contador = 0;

        // Crea un array con las palabras de la cadena principal
        String[] cadenaPrincipalTroceada = cadenaA.split(" ");
        
        // Compara "b" con el array y calcula la cantidad de coincidencias 
        for (int i = 0; i < cadenaPrincipalTroceada.length; i++) {
            if (cadenaPrincipalTroceada[i].equals(b) ) {
                contador++;
            }
        }

        // Si las coincidencias son igual o mayores que "n" se devuelve "true"
        if (contador >= numero) {
            estaContenido = true;
        }

        // Devuelve el valor booleano definitivo  
        return estaContenido;
    }
    public static void main(String[] args) {

        // Si el resultado de la función es cierto
        if ( countString(a, b, n) ) {
            System.out.println("La cadena " + "'" + b + "'" + " está contenida como mínimo " + n + " veces en la cadena " + "'" + a + "'");
        }
        else { // En caso contrario
            System.out.println("La cadena " + "'" + b + "'" + " no está contenida como mínimo " + n + " veces en la cadena " + "'" + a + "'");
        }

    }

}
