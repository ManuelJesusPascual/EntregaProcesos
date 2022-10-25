package Ejercicio_2;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(args);
        pb.inheritIO();
        File d = new File("src/Ejercicio_2/");
        pb.directory(d);

        try {
            Process p = pb.start();
            while(p.isAlive()) {
                System.out.println("El proceso esta en ejecucion");
                Thread.sleep(3000);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
        }


