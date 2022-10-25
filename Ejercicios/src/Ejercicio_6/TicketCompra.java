package Ejercicio_6;

import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {

        Scanner snInt  = new Scanner(System.in);
        int codigo = snInt.nextInt();
        double precio = snInt.nextDouble();
        int cantidad = snInt.nextInt();

        System.out.println(codigo + " - " + precio + " - " + cantidad + " - " + precio*cantidad);

    }
}
