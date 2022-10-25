package Ejercicio_11;

import java.io.*;

public class leerFichero {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\pruebas\\carpeta1\\fichero2.txt");
        BufferedReader br = new BufferedReader(fr);



        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }

}
