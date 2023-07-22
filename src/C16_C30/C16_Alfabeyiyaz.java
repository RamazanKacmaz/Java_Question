package C16_C30;

public class C16_Alfabeyiyaz {
    /*Soru 25-)
    Alfabeyi konsola yazdırın.
            örnek:
    a b c .. .. .. .. y z
    ipucu: char kullanmak iyi bir fikir olabilir :wink:*/
    public static void main(String[] args) {

        char alfabe1 = 'a';
        char alfabe2 = 'z';
        String a = "";


        for (char i = 'a'; i <= 'z' ; i++) {
            a += i + " - " ;
        }
        a = a.substring(0,a.length()-2);

        System.out.println(a);
    }
}
