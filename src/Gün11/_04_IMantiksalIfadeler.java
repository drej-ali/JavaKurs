package Gün11;

import java.util.Scanner;

public class _04_IMantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal(logic) ifadeler
        //&& -> ve    ||-> veya demek

        //girilen sayı pozitif ve tek ise, ekrana uygun sayı girildi
        // değilse uygun sayı girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi>0 && sayi%2==1){System.out.print("uygun sayı girildi.");}
        else {System.out.print("uygun sayı girilmedi.");}



    }
}
