package Gün15;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        //girilen bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner read = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayi= read.nextInt();
        int toplam=0;

        for ( int a=0;a<=sayi ;a++ )
            toplam=toplam+sayi; // toplam+=a yazsak ta olur

        System.out.println("toplam = " + toplam);



    }
}
