package C16_C30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class C30_MinMaxNummer {
    /*9:
    Soru-38)
    Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum
     ve maksimum sayıları yazdıran bir yöntem yazın
    Örnek:
    Input : {3,2,5,4,1,6}
    Output :
    min: 1
    max: 6
    Ipucu: sort yöntemni kullanabilirsiniz.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzunluk giriniz");
        int size = scanner.nextInt();

        int [] size2 = new int[size];
        Arrays.sort(size2);

        int max = size2[0];
        int min = size2[0];

        System.out.println("Element girin.");

        for (int i = 0; i < size ; i++) {


            size2 [i] = scanner.nextInt();

            if (size2[i] > max){
                max = size2[i];
            }
            if (size2[i] < min){
                min = size2[i];
            }
        }

        System.out.println("Min = "  +  min);
        System.out.println( "Max = " + max);





    }
}
