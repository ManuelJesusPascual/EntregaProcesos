package Ejercicio_5;

import java.util.Scanner;

public class PreguntaNombre {

    public static void main(String[] args) {
        System.out.println("Introduce tu nombre");
        Scanner sn = new Scanner(System.in);
        String nombre = sn.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }

}
