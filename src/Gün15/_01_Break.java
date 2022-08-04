package Gün15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen bir sayının, 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.
        //16-9-25 gibi

        Scanner read = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi = read.nextInt();

        int ksayi = 0;
        int arananSayi = 0;

        while (sayi >= ksayi) {
            if (sayi == (ksayi * ksayi)) {
                arananSayi = ksayi;
                break;
            }
            ksayi++;
        }
        if (arananSayi >= 0) { //aranan sayıya bir değer atandı mı yani bulundu mu
            System.out.println("tam karedir, sayı:" + arananSayi);
        } else System.out.println("tam kare değildir.");

    }
}
