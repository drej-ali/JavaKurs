package Gün06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdırınız.
        // Merhaba  -> length 7
        // 0123456
        //yani Length-1 i bana son harfin indexini verir.

        Scanner oku=new Scanner(System.in);

        System.out.print("stringi giriniz:");
        String cumle= oku.nextLine();

        System.out.println("cumle = " + cumle);

        int uzunluk=cumle.length();
        System.out.println("uzunluk = " + uzunluk);

        char sonHarf=cumle.charAt(uzunluk-1);
        //toplam karakter sayısı okundu.
        //fakat charAt indexe göre çalıştığından 1 eksiği alındı.
        System.out.println("sonHarf = " + sonHarf);

    }
}
