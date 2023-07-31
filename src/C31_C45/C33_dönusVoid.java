package C31_C45;

public class C33_dönusVoid {
    /*Soru 41-)
    Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını
    yazdıran bir dönüş methodu (void) yazın
    Method name=sum
    eğer metodu bu şekilde çağırırsanız

    toplam(1,2,3) çıktı =6
    toplam(1,2,3,4,5) çıktı =15
    sum(1,2) output=3
    Ipucu:  varargs sorusu, varargs olusturalım*/

    public static void main(String[] args) {

        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5);
        sum(1, 2);
        sum(6, 2);


    }

    public static void sum(int... numbers) {

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sonuc :  " + sum);
    }
}
