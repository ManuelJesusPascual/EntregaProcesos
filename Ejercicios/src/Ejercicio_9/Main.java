package Ejercicio_9;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {

        String[] comando = {"java","src/Ejercicio_9/PreguntaNombre.java"};
        Runtime r = Runtime.getRuntime();


        try {
            Process p = r.exec(comando);
            FileReader fr = new FileReader("src/Ejercicio_9/input.txt");
            BufferedReader br = new BufferedReader(fr);

            OutputStream os = p.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osr);

            String line = br.readLine();
            while(line != null){
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.close();
            osr.close();
            os.close();
            p.waitFor();
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);

            String line2 = br2.readLine();
            while(line2 != null){
                System.out.println(line2);
                line2 = br2.readLine();
            }

            is.close();
            isr.close();
            br2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

