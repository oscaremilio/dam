
/*
LISP es un lenguaje en el que toda instrución va encerrada entre paréntesis. 
El programa comprobará una única cadena con una instrucción en lenguaje LISP, 
y después comprueba si el número de paréntesis es correcto 
(es decir, si coinciden el número de aperturas y de cierres, 
sin entrar en otros detalles como su posición concreta).
*/

public class Ejercicio_13_LispChecker {

    public static void main(String[] args) {

        // Cadena a comprobar
        String cadena = "(let ( (new (x-point a y) ) ) )";
        // Contadores para los paréntesis
        int cantidadAperturas = 0, cantidadCierres = 0;
        
        // Comprueba cada carácter de la cadena 
        for (int i = 0; i < cadena.length(); i++) {
            // Contiene cada iteración un carácter de la cadena
            char letra = cadena.charAt(i);
            // Suma la cantidad del tipo de paréntesis indicado
            if ( letra == '(' ) {
                cantidadAperturas++;
            }
            
            if ( letra == ')' ) {
                cantidadCierres++;
            }
        }
        
        // Si coindice la cantidad de ambos tipos y al menos hay 1 de cada
        if ( (cantidadAperturas == cantidadCierres) && cantidadAperturas != 0 && cantidadCierres != 0) {
            System.out.println("Número de paréntesis correcto.");
        }
        else { // En caso contrario no es válida
            System.out.println("No es una instrucción válida.");
        }

    }
    
}
