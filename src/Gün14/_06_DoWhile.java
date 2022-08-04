package Gün14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // kullanıcı sıfır değeini girene kadar girdiği sayıların toplamını bulunuz.

        int sayi = 1;
        int toplam = 0;

        while (sayi != 0) {
            Scanner oku = new Scanner(System.in);
            System.out.print("sayı giriniz:");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);

        // 2. yol
        Scanner oku1 = new Scanner(System.in);
        int toplam1 = 0;
        int sayi1 = 1;

        do {
            System.out.print("sayı giriniz:");
            sayi1 = oku1.nextInt();
            toplam1 = toplam1 + sayi1;

        } while (sayi1 != 0);

        System.out.println("toplam = " + toplam1);
    }
}
