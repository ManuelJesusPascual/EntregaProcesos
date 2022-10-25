package Ejercicio_4;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(args);

        File d = new File("src/Ejercicio_4/");
        pb.directory(d);
        pb.redirectOutput(new File("src/Ejercicio_4/Salida.txt"));

        try {
            Process p = pb.start();
            while(p.isAlive()) {
                System.out.println("El proceso esta en ejecucion");
                Thread.sleep(3000);
            }
            System.out.println("El proceso ha terminado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
        }


