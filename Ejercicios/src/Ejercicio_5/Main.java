package Ejercicio_5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(args);

        File d = new File("src/Ejercicio_5/");
        pb.directory(d);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectInput(new File("src/Ejercicio_5/input.txt"));

        try {
            Process p = pb.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

