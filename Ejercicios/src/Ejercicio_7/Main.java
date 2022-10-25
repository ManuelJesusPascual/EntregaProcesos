package Ejercicio_7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder p1 = new ProcessBuilder("java","Clase_Uno.java");
        p1.directory(new File("src/Ejercicio_7"));
        ProcessBuilder p2 = new ProcessBuilder("java","Clase_Dos.java");
        p2.directory(new File("src/Ejercicio_7"));
        ProcessBuilder p3 = new ProcessBuilder("java","Clase_Tres.java");
        p3.directory(new File("src/Ejercicio_7"));

        List<ProcessBuilder> a = new ArrayList<>();



        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.get(a.size()-1).redirectOutput(new File("src/Ejercicio_7/test.txt"));
        try {
            List<Process> lProcesos = ProcessBuilder.startPipeline(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
