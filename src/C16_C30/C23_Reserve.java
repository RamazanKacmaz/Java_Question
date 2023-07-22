package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C23_Reserve {
    /*Soru 32-)
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen uzunluk  bilgilerinizi giriniz");
        int uzunluk = scanner.nextInt();

        int [] arr = new int[uzunluk];
        int [] arrReserve = new int[uzunluk];

        System.out.println("Aray in degerlerini giribiz...");

        for (int i = 0; i < arr.length ; i++) {
            int degerler = scanner.nextInt();
            arr[i] +=degerler;
        }

        for (int i = 0; i <arr.length ; i++) {
            arrReserve[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arrReserve));

    }
}
