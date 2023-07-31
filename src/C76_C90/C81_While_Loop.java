package C76_C90;

public class C81_While_Loop {
    public static void main(String[] args) {
        /*Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        yazdirin.*/

       int sayi = 10;

        while (sayi <= 99){

            if (sayi % 7 == 0){
                System.out.print(sayi +" ");
            }
            sayi++;
        }

    }
}
