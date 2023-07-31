package C16_C30;

public class Telefon {
    /*
        Soru 42
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun
        ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım.
        Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
     */
    String marka = "Marka belirtilmemis";
    String model = "Model belirtilmemis";
    int fiyat ;
    int yil;
    Telefon(){
        //parametresiz constructor
    }
    Telefon(String mrk, String mdl, int fyt, int yl){  //parametreli constructor
        marka = mrk;
        model= mdl;
        fiyat= fyt;
        yil= yl;
    }
    @Override
    public String toString() {
        return "Telefon bilgileri ==>{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat=" + fiyat +
                ", yil=" + yil +
                '}';
    }
    public static void main(String[] args) {
        Telefon tel1 = new Telefon();
        tel1.marka = "Iphone";
        tel1.fiyat = 50000;
        tel1.yil = 2023;
        tel1.model = "Iphone 14";
        Telefon tel2 = new Telefon("Samsung","Note5",25000,2022);
        System.out.println(tel1); //Telefon bilgileri ==>{marka='Iphone', model='Iphone 14', fiyat=50000, yil=2023}
        System.out.println(tel2);// Telefon bilgileri ==>{marka='Samsung', model='Note5', fiyat=25000, yil=2022}
    }
}

