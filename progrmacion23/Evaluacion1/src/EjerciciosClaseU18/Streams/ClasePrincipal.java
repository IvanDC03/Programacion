package EjerciciosClaseU18.Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClasePrincipal {

    public static void main(String[] args) {
        leerFichero leer = new leerFichero();
        try {
            leer.leer();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

class leerFichero {
    public void leer() throws IOException {
        String filePath = "C:\\Users\\Iván\\OneDrive\\Documents";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}