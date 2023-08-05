package C91_C105;

import java.util.Arrays;
import java.util.Scanner;

public class C92_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Resul","Omer","Mehmet","Ertugrul","Ozan","Suleyman"};

        enuzunenkisa(isimler);
    }

    private static void enuzunenkisa(String[] isimler) {

        String enkisa = isimler[0];
        String enuzun = isimler[0];

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].length() < enkisa.length()){

                enkisa = isimler[i];
            }

            if (isimler[i].length() > enuzun.length()){
                enuzun = isimler[i];
            }
        }
        System.out.println("En uzun isim :" + enuzun);
        System.out.println("En kisa isim :"  + enkisa);
    }


}
