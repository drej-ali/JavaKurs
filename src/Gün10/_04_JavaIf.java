package Gün10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        // mesela sayı negatifse yukardaki çalışmıyor. pozitife çevirip oyle devam edilebilir
        // yada kalan -1 e eşit ise tek yaz da diyebiliriz.
        if (sayi<0){
            sayi=sayi*(-1);
        }

        if (sayi%2==1){
            System.out.print("TEK");
        }
        if (sayi%2==0){
            System.out.print("ÇİFT");
        }
    }
}
