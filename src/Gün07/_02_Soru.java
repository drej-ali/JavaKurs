package Gün07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadın adını ve soyadını ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı giriniz:");
        String tamAdSoyad= oku.nextLine();

        //boşluğun indexini bulup substringle alabiliriz.
        int boslukIndex=tamAdSoyad.indexOf(" ");
        String ad=tamAdSoyad.substring(0,boslukIndex); //bosluk index dahil değil
        String soyad=tamAdSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        // diğer bir çözüm yöntemi
        System.out.println("Ad = " + tamAdSoyad.substring(0,tamAdSoyad.indexOf(" ")));
        System.out.println("Soyad = " + tamAdSoyad.substring(tamAdSoyad.indexOf(" ")+1));




    }
}
