package C91_C105;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C102_Array_List {
    public static void main(String[] args) {

        /*Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        liste olarak dondurecek bir method olusturun.*/

        System.out.println(isimlistesi());
    }

    private static List<String> isimlistesi() {
        Scanner scanner;
        String girilenisim;
        List<String> newisimler = new ArrayList<>();

        do {
            scanner = new Scanner(System.in);
            System.out.println("isim gir.................");
            girilenisim = scanner.nextLine();

            if (!girilenisim.equalsIgnoreCase("Q")) {
                newisimler.add(girilenisim);
            }

        }while (!girilenisim.equalsIgnoreCase("q")) ;
        return newisimler;
    }
}
