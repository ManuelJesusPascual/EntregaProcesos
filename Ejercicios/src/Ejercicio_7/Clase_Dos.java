package Ejercicio_7;

import java.util.Scanner;

public class Clase_Dos {
    public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
        for(int x = 0;x<10;x++){
            String lectura = sn.nextLine();
            String[] primerosTresNumeros = lectura.split("\\.");
            if(Integer.parseInt(primerosTresNumeros[0])<223){
                System.out.println(lectura);
            }
        }

    }
}