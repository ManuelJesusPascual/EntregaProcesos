package Ejercicio_8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Runtime r = Runtime.getRuntime();
            String[] comando = {"java","src/Ejercicio_8/ProcesoLento.java"};
            Process p = r.exec(comando);
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Ejercicio_8/salidaProcesoLento2.txt"));
            String line = br.readLine();

            while (line != null) {
                bw.write(line);
                line = br.readLine();
            }

            br.close();
            bw.close();
            isr.close();
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
