package Gün09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi= oku.nextInt();



        System.out.println("sayı tek mi = " + (sayi%2==1));
        System.out.println("sayi çift mi= " + (sayi%2==0));




    }
}
