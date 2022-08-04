package Gün10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // girilen iki sayıdan büyük olanının değerini ekrana yazdırınız.
        // eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int sayi1= oku.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2){
            System.out.println("büyük olan sayı = " + sayi1);
        }
        if (sayi2>sayi1){
            System.out.println("büyük olan sayı = " + sayi2);
        }
        if (sayi1==sayi2){
            System.out.print("eşit");
        }








    }
}
