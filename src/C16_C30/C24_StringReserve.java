package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C24_StringReserve {
   /* Soru 32-)
    Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir uzunluk giriniz");
        int uzunluk = scanner.nextInt();

        int [] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk ; i++) {
            System.out.println("element gir");
            int elament = scanner.nextInt();
            arr[i] =+ elament;
        }
        System.out.println(Arrays.toString(arr));

    }
}
