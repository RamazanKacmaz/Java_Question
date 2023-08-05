package C91_C105;

public class C96_Multi_Dimensonal_Arrays {
    /*Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
    method olusturun.*/

    public static void main(String[] args) {

        int [][] sayilar = {{3,5} , {8,3} , {14,2}};

        int toplam = 0;

        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j < sayilar[i].length ; j++) {
                if (sayilar[i][j] % 2 == 0  ){
                    toplam += sayilar[i][j];
                }
            }
        }
        System.out.println(toplam);
    }

}
