package C16_C30;

public class Student {

    String ad = "Ad belirtilmedi";
    String soyad = "Soyad belirtilmedi";
    int yas ;
    char cinsiyet ;
    Student(String ad,String soyad, int yas, char cinsiyet){
        this.ad = ad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                '}';
    }
}
