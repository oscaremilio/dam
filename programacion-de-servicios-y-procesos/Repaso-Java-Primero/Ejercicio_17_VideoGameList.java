/* 
Programa que almacena objetos de una clase llamada VideoGame que debes definir.
Por cada videojuego, vamos a almacenar su título, género y precio.
Añade también los corespondientes getters, setters y constructor para configurar
estos valores.
Define una clase main pública y la clase VideoGame en el mismo código fuente.
Después, en el método main, crea un array de 5 videojuegos, 
pide al usuario que rellene la información de cada videojuego, 
y luego muestra el título más barato y el título más caro del array.
*/

// Importa la clase Scanner
import java.util.Scanner;

// Clase para rellenar el array
class VideoGame {
    
    // Variables
    String titulo;
    String genero;
    float precio;

    // Constructor
    public VideoGame(String t, String g, float p) {
        titulo = t;
        genero = g;
        precio = p;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String ti) {
        titulo = ti;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String ge) {
        genero = ge;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float pre) {
        precio = pre;
    }

}

public class Ejercicio_17_VideoGameList {
    public static void main(String[] args) {

        // Variables
        String titulo, genero;
        float precio, masBarato, masCaro;

        // Crea un array de 5 videojuegos
        VideoGame[] videojuegos = new VideoGame[5];

        // Crea el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Pide al usuario que rellene el array
        System.out.println("Introduce los títulos, genero y precio de los videojuegos...");

        // El usuario rellena el array
        for (int i = 0; i < videojuegos.length; i++) {

            System.out.println("-- Videojuego " + (i+1) + " --");
            // Pide los datos al usuario
            System.out.print("Título: ");
            titulo = sc.nextLine();

            System.out.print("Género: ");
            genero = sc.nextLine();
            
            System.out.print("Precio: ");
            precio = sc.nextFloat();

            sc.nextLine();
            // Rellena la posición indicada del array
            videojuegos[i] = new VideoGame(titulo, genero, precio);
        }

        System.out.println();
        
        /* Si quisieramos ver la lista completa de juegos introducidos
        System.out.println("____Listado de Videojuegos____");
        
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println("Videojuego " + (i+1));
            System.out.println("Título: " + videojuegos[i].titulo);
            System.out.println("Género: " + videojuegos[i].genero);
            System.out.println("Precio: " + videojuegos[i].precio);
            System.out.println();
        }
        */

        // Asigna el primer precio del array a estas variables
        masBarato = videojuegos[0].precio;
        masCaro = videojuegos[0].precio;

        // Cambia las variables si el precio es más alto o más bajo
        for (int i = 1; i < videojuegos.length; i++) {
            if( (videojuegos[i].precio) < masBarato) {
                masBarato = videojuegos[i].precio;
            }
            if( (videojuegos[i].precio) > masCaro) {
                masCaro = videojuegos[i].precio;
            }
        }

        // Imprime el precio más caro y el más barato
        System.out.printf("El precio más caro es de %.2f €\n", masCaro);
        System.out.printf("El precio más barato es de %.2f €", masBarato);

        // Cierra el objeto Scanner
        sc.close();

    }
}
