/*
Programa con una función llamada esPalindromo.
Esta función tomará una cadena como parámetro y devolverá un booleano
indicando si esta cadena es un palindromo (es decir, una cadena que
puede ser leída igual hacia delante que hacia atrás, ignorando las
mayúsculas o minúsculas, y los espacios en blanco).
Prueba esta función desde la función main con los textos:
"Hannah", 
"Too hot to hoot" 
y "Java is the best language" (este último no es un palindromo).
*/

public class Ejercicio_14_Palindrome {
    
    // Función
    public static boolean esPalindromo(String texto) {
        
        // Booleano para validar el texto
        boolean coincidencia = false;
        // Divide el texto para quitar los espacios en blanco
        String[] textoTroceado = texto.toLowerCase().split(" ");
        // Crea una nueva cadena vacía
        String nuevoTexto = "";
      
        
        // Damos valor a un nuevo texto con el array sacado del texto original
        for(int i=0; i < textoTroceado.length; i++) {
            nuevoTexto += textoTroceado[i];
        } 

        // Longitud del nuevo texto
        int longitud = nuevoTexto.length();
        // Valor para comprobar más adelante las letras coincidentes
        int caracterNoIgual=0;

        // Crea dos arrays con la longitud del texto
        char[] caracteres = new char[longitud];
        char[] caracteresInversa = new char[longitud];

        // Rellena este array con el texto en su orden normal
        for(int i = 0; i < longitud; i++) {
            caracteres[i] = nuevoTexto.charAt(i);
        }

        // Rellena este array con el texto en su orden inverso
        for(int i = 0; i < longitud; i++) {
            int contador = longitud-1;
            caracteresInversa[i] = nuevoTexto.charAt(contador-i);
        }

        // Comprueba si los arrays son iguales
        for (int i = 0; i < longitud; i++) {  
            if (caracteres[i] != caracteresInversa[i]) {
                caracterNoIgual++;
            }
        }

        // Si coinciden todas las letras entre ambos arrays
        if (caracterNoIgual > 0) {
            coincidencia = false;
        }
        else {
            coincidencia = true;
        }

        // Devuelve un booleano
        return coincidencia;
    }

    public static void main(String[] args) {
        // Usa la función "esPalindromo"
        if ( esPalindromo("Too hot to hoot") ){ // Booleano devuelto es "true"
            System.out.println("Es palindromo");
        }
        else { // Booleano devuelto es "false"
            System.out.println("No es palindromo");
        }

    }

}
