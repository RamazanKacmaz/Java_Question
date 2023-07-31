package C76_C90;

public class C83_While_Loop {
    /*Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
    donduren bir method olusturun.*/

    public static void main(String[] args) {

        System.out.println(tersmetin("Ramazan"));

    }

    private static String tersmetin( String metin) {

        String tersmetin = "";

        int index = metin.length()-1;

        while (index >= 0){
            tersmetin += metin.charAt(index);
            index--;
        }

        return tersmetin;


    }
}
