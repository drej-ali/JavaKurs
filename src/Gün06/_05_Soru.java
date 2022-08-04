package Gün06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        //girilen bir ad soyadı "Ismet Temur" I.T. diye yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad soyad giriniz:");
        String tamAd= oku.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf(" "); //bunun bir fazlası soyadın ilk harfi
        char soyadIlkHarf=tamAd.charAt(boslukIndex+1);

        System.out.println("Şifreli Ad = " + ilkHarf+"."+soyadIlkHarf+".");

    }
}
