package C61_C75;

public class C66_String_Manipulations {
    public static void main(String[] args) {
          /*Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
            input1 : “15.30 €” , input2 : “11.40 €”
    output : 36.70 €*/
        String input1 = "15.30 $";
        String input2 = "11.40 $";
        input1 = input1.replace("$", "");
        input2 = input2.replace("$","");

        double toplam1 = Double.parseDouble(input1);
        double toplam2 = Double.parseDouble(input2);
        System.out.println(toplam1+toplam2 + "$");
    }


}
