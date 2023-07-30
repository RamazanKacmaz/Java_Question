package C16_C30;

import java.util.Arrays;
import java.util.Scanner;

public class C28_OrtadakiElaman {
    /*Soru 36-)
    Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    Örnek:
    inputarr[]=   {1,2,3,4,5,6,7}
    output:         4
    İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun
    cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)*/

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("uzunluk gir");
        int length = scanner.nextInt();

        if (length <= 0){
            System.out.println("gecersiz");
            return;
        }

        int [] inputtarr = new int[length];

        System.out.println("Elaman gir");

        for (int i = 0; i <length ; i++) {

            inputtarr[i] =scanner.nextInt();

        }

        System.out.println(Arrays.toString(inputtarr));

        int middleElement = findMiddleElement(inputtarr);

        System.out.println("Output : " + middleElement);


    }

    public static int findMiddleElement(int[] inputtarr) {

        if (inputtarr == null || inputtarr.length == 0){
            throw new IllegalArgumentException("Array is emtpy or null");
        }

        int middleIndex = inputtarr.length / 2;
        return inputtarr[middleIndex];
    }

}
