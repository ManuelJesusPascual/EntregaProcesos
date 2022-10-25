package Ejercicio_9;

import java.util.Scanner;

public class PreguntaNombre {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nombre = sn.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

}
