package Gün09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        // kullanıcının gireceği iki sayının birbirine
        // eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int s1= oku.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int s2= oku.nextInt();

        System.out.println("sayılar eşit mi? = " + (s1==s2));





    }
}
