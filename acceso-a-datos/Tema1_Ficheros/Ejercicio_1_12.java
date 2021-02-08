import java.io.*;

/*
Programa capaz de copiar todo el contenido de un fichero en otro fichero. Debes leer todo el fichero inicial y guardarlo en un único bloque que tendrá el mismo tamaño el fichero.
*/

public class Ejercicio_1_12 {
    public static void main(String[] args) {

        // El archivo a copiar ocupa 96 KB, por ello hacemos 1 bloque de 100 KB
        final int BUFFER_SIZE = 100*1024;

        System.out.println("Copiando fichero binario...");   

        // Copia el fichero (sustituye "owl.webp" por otro fichero binario)
        try {
            InputStream ficheroEntrada = new FileInputStream( new File("owl.webp") );
            OutputStream ficheroSalida = new FileOutputStream( new File("owlCopia.webp") );

            // Crea un array con valores de 100 KB
            byte[] buf = new byte[BUFFER_SIZE];

            int cantidadLeida;

            // Copia el archivo original en bloques de 100 KB
            while ( (cantidadLeida = ficheroEntrada.read(buf, 0, BUFFER_SIZE)) > 0) {
                ficheroSalida.write (buf, 0, cantidadLeida);
            }

            // Cierra ambos ficheros
            ficheroEntrada.close();
            ficheroSalida.close();

        }
        // Avisa en caso de error
        catch (Exception errorFichero){
            System.out.println("Se ha producido un error: " + errorFichero.getMessage() );
        }

        System.out.println("Terminado.");

    }   
}
