package Gün20;

public class _02_JavaMethod {

    // ya buraya

    public static void main(String[] args) {  //ANA kısım burada başlıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(4, 5);// daha önce yazılmış biz çağırıp kullanıyoruz
        // aynı bunun gibi bizde böyle metodlar yazabiliriz.
        // mesala ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        merhabaYaz();
        merhabaYaz();
        merhabaYaz();
    } //ANA kısım burada bitiyor

    //ya da buraya

    public static void merhabaYaz(){ // fonksiyon, metod da denilebilir.
        System.out.println("Fonksiyonda Merhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

}
