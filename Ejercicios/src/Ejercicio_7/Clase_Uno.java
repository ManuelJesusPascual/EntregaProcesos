package Ejercicio_7;

public class Clase_Uno {
    public static void main(String[] args) {

        for(int x = 0;x<10;x++){
            String a = "";
            for(int z = 0;z<4;z++){
                int y = (int) Math.floor(Math.random()*255);
                if(z == 3) {
                    a = a.concat(Integer.toString(y));
                }else{
                    a = a.concat(Integer.toString(y)+".");
                }
            }
            System.out.println(a);
        }



    }
}

