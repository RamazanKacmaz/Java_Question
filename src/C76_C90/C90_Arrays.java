package C76_C90;

public class C90_Arrays {
    public static void main(String[] args) {

        /*Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz.*/

        System.out.println(arrtoplam());

    }

    private static int arrtoplam( ) {
        int [] arr = {3,5,7,8,9,12};
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            toplam += arr[i];
        }
        return toplam;

    }
}
