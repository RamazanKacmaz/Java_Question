package C16_C30;

import java.util.Arrays;

public class C26_Parametre {
    /*Soru 34-)
    Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların
    toplamını yazdıran bir Method yazın.

    Örnek
    String str : ade1r4d3
    Int toplam : 8
    İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz*/
    public static int rakamlarToplami(String str){
        int toplam = 0;

        String[] rakamlar = new String[str.length()];

        int index = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                rakamlar[index++] = Character.toString(c);
            }
        }

        for (int i = 0; i < index; i++) {
            toplam += Integer.valueOf(rakamlar[i]);
        }

        return toplam;

    }


    public static void main(String[] args) {

        String str = "ade1r4d3";
        int toplam = rakamlarToplami(str);
        System.out.println("String str: " + str);
        System.out.println("Int toplam: " + toplam);

    }

}
