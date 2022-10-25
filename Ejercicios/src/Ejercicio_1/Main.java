package Ejercicio_1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(args);
        Map<String,String> entorno = pb.environment();
        System.out.println("Entorno de un proceso");
        System.out.println("------------------------");
        
        entorno.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}