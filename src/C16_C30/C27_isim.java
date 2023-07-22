package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C27_isim {
    /*Soru 35-)
    Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
    Örnek:
    String isim:    Yakup
    char arr[]:     [Y,a,k,u,p]
    İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
    Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
     */

    static Scanner scan = new Scanner(System.in);
    static String isim;


    public static void main(String[] args) {

        System.out.println (Arrays.toString(cArr(isim)));


    }//main sonu

    public static char[] cArr(String name){

        System.out.println("Lütfen isminizi giriniz");
        isim = scan.nextLine();
        char[] cArr = new  char[isim.length()];

        for (int i = 0; i < (isim.length()); i++) {

            cArr[i] = isim.charAt(i);

        }
        return cArr;


    }
}
