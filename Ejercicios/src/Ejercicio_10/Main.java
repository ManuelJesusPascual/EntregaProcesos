package Ejercicio_10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("cmd","/C","md", "carpeta1");
        pb.directory(new File("C:\\pruebas"));
        ProcessBuilder pb2 = new ProcessBuilder("cmd", "/C","type", "nul", ">", "archivoenblanco.txt");
        pb2.directory(new File("C:\\pruebas\\carpeta1"));
        ProcessBuilder pb3 = new ProcessBuilder("notepad","archivoenblanco.txt");
        pb3.directory(new File("C:\\pruebas\\carpeta1"));


        try {
            Process p1 = pb.start();
            p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
            Process p3 = pb3.start();
            p3.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
