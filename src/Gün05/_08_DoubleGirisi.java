package Gün05;

import java.util.Locale;
import java.util.Scanner;

public class _08_DoubleGirisi {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        // oku.useLocale(Locale.ENGLISH); locale göre , veya . kullanılır.

        System.out.print("Bir double değer giriniz:");

        double deger= oku.nextDouble();


//        Tr de, UK de . kullanılıyor
        System.out.println("deger = " + deger);



    }
}
