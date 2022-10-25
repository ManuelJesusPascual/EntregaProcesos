package Ejercicio_7;

import java.util.Scanner;

public class Clase_Tres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        while (lectura.hasNext()){
            String ip = lectura.nextLine();
            String[] primerosTresNumeros = ip.split("\\.");
            if(Integer.parseInt(primerosTresNumeros[0])<128){
                System.out.println(ip + " Clase A");
            }else if (Integer.parseInt(primerosTresNumeros[0])<192){
                System.out.println(ip + " Clase B");
            }else{
                System.out.println(ip + " Clase C");
            }
        }
    }


}
