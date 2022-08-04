package Gün26._05_Soru;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Okul ok=new Okul();
        ok.adi="Atatürk okulu";
        ok.mudurAdi="Metin Haşal";
        ok.ucreti=9000;

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="mehmet yılmaz";
        ogr.okulu = ok;

        System.out.println("ogr = " + ogr.okulu.adi);


    }
}
