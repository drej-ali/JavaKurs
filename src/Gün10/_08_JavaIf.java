package Gün10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("en az iki basamaklı bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi%10==sayi/10%10){
            System.out.print("eşit");
        }
        if (sayi%10!=sayi/10%10){
            System.out.print("eşit değil");
        }



    }
}
