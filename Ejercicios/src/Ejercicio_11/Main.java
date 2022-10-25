package Ejercicio_11;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("cmd", "/C","type", "nul", ">", "fichero2.txt");
        pb.directory(new File("C:\\pruebas\\carpeta1"));
        ProcessBuilder pb2 = new ProcessBuilder("notepad","fichero2.txt");
        pb2.directory(new File("C:\\pruebas\\carpeta1"));
        ProcessBuilder pb3 = new ProcessBuilder("java","src/Ejercicio_11/leerFichero.java");
        pb3.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try {
            Process p1 = pb.start();
            p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
            Process p3 = pb3.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
