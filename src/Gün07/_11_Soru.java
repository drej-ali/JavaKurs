package Gün07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // girilen bir stringteki nokta saytısını bulunuz.
        //01.02.20
        //01.2001

        Scanner oku=new Scanner(System.in);
        System.out.print(" istediğinizi yazınız:");

        String girilen= oku.nextLine();
        int uzunluk1=girilen.length();

        String noktasız= girilen.replace(".",""); // noktalar yok edildi
        System.out.println("noktasız = " + noktasız);
        int uzunluk2=noktasız.length();

        System.out.println("nokta sayısı = " + (uzunluk1-uzunluk2));




    }
}
