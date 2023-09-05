package C61_C75;

public class C67_String_Manipulations {
    public static void main(String[] args) {
        /*Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                input : java1 ogRe2@nMek3 #ne +Gu=zel
                output : Java ogrenmek ne guzel.*/

        String input="java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\d","");
        input=input.replaceAll(" ","3");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("3",", ");
        input=input.toUpperCase().charAt(0)+input.substring(1).toLowerCase();

        System.out.println(input);
    }

}
