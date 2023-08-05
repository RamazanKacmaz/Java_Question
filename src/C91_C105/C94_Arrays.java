package C91_C105;

public class C94_Arrays {
    public static void main(String[] args) {
        /*Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.*/

        String [] isimler = {"Ali", "Veli" , "Ramazan", "Samuellent"};

        enuzunenkisaisim(isimler);
    }

    private static void enuzunenkisaisim(String[] isimler) {

        String enuzun = isimler[0];
        String enkisa = isimler[0];

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length() > enuzun.length()){
                enuzun = isimler[i];
            }
            if (isimler[i].length() < enkisa.length()){
                enkisa = isimler[i];
            }
        }
        System.out.println("en uzun : " + enuzun);
        System.out.println("En kis : " + enkisa);

    }

}
