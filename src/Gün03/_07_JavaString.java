package Gün03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;

        String ad="Muhammed Ali"; // String ifadelerin  sayi gibi bir siniri olmadigindan "" ile siniri belli edilir.
        String soyad="Güler";     // Güler\0 gibi ozel  karakter koyarak siniri belirliyor.

        System.out.println("ad"); // ad yazar
        System.out.println(ad);           // Muhammed Ali yazar

        System.out.println("ad"+"soyad");  // ad soyad yazar
        System.out.println(ad+soyad);      // Muhammed Ali Güler yazar

        System.out.println(ad+" "+soyad);

        String tamIsım=ad+soyad;           // Muhammed AliGüler yazar
        String tamIsım2=ad+" "+soyad;      // Muhammed Ali Güler yazar

        System.out.println("tamIsım = " + tamIsım);
        System.out.println("tamIsım2 = " + tamIsım2);

        int yas=28;
        int kilo=100;

        String bilgi=ad+soyad+yas+kilo; //Sayilar String ile toplanirsa kelime gibi islem gorur.
        System.out.println("bilgi = " + bilgi);
        System.out.println(ad+" "+soyad+" "+yas+" "+kilo);











    }
}
