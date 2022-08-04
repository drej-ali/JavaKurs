package Gün02;

public class _05_Değişkenler {
    public static void main(String[] args) {
//        Değişkenler

        int sayi;   // int: int mikrtarınca alan kaplayan tam sayı tipi
        int Sayi;   // bu ikisi farklı değişken

        sayi=5;  //sayının değeri 5
        System.out.println("sayi");         // kelime olarak sayı
        System.out.println(sayi);           //değişkenin değerini yazar
        System.out.println("sayi="+sayi);   //bu durumda ikisini birlikte yazar

        sayi=7; // sayının değeri 7

        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=5+5+7+7;

        System.out.println("cevresi="+cevre);


        kisaKenar=sayi;   //sayinin  değeri kisaKenara atandı  kisaKenar=7
        cevre=(kisaKenar+uzunKenar)*2;   //pc de çarpma işlemi * iledir

        System.out.println("cevre = " + cevre);







    }
}
