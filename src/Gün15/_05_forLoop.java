package Gün15;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayıların çarpımını bulunuz.

        Scanner read=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayi= read.nextInt();
        int carpım=1;

        for ( int a=1;a<=sayi ;a++)
            carpım=carpım*a;

        System.out.println("carpım = " + carpım);






    }
}
