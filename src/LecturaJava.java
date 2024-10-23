import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaJava {

    public static void main(String[] args) {
        // llamamos a leerfichero con la ruta donde se encuentra

        leerfichero("src\\datos.dat");

    }

    public static void leerfichero(String ruta) {

        String line = "";
        BufferedReader lector; // declarar el flujo que se encarga de leer el fichero
        int contadorLineas = 0;

        // try catch para controlar excepciones
        try {
            lector = new BufferedReader(new FileReader(ruta));

            do {
                line = lector.readLine();

                if (line != null) {
                    System.out.println(line + " -->" + line.length());
                    contadorLineas++;
                }
            } while (line != null); // el bucle do while lo uso para leer de linea a linea hasta llegar al final del
                                    // fichero

            System.out.println("El numero de lineas es: " + contadorLineas);
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
