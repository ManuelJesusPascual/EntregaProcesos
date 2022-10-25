package Ejercicio_6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(args);

        File d = new File("src/Ejercicio_6");
        pb.directory(d);
        System.out.println("Introduce el codigo, el precio y la cantidad, separados por enters.");
        pb.inheritIO();

        try {
            File e = new File("src/Ejercicio_6/salida.txt");
            pb.redirectOutput(ProcessBuilder.Redirect.appendTo(e));
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

