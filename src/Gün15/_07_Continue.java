package Gün15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı isteyiniz
        // bu sayılardan 5 ile 10 aradındakiler hariç diğerlerini toplasın

        Scanner read=new Scanner(System.in);
        int toplam =0;

        for ( int a=1;a<=5 ;a++ )
        {
            System.out.println("bir sayı giriniz:");
            int sayi = read.nextInt();

            if (sayi > 6 && sayi < 10) // 7 8 9
                continue; // çalıştığında sonraki adımları pass geçer ve döngü devam eder

            toplam= toplam+sayi;
            System.out.println("toplam = " + toplam);
        }







    }
}
