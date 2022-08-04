package Gün10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi= if
        //girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız.
        // algoritma
        //1- başla
        //2- sayı oku
        //3- sayı>10 ise ekrana yaz
        //4-dur

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi>10)
        { // evet çıkışı
            System.out.print("10 dan büyük.");
        } // hayır çıkışı işlem tanımlanmadığı için işlem yok
    }
}
