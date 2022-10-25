package Ejercicio_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce el comando a ejecutar");
        String comando = sn.nextLine();
        String[] command = comando.split(" ");
        ProcessBuilder pb = new ProcessBuilder(command);
        pb.inheritIO();
        File d = new File("src/Ejercicio_3/");
        pb.directory(d);

        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

