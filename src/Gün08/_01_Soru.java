package Gün08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // 1-ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("adınız giriniz:");
        String ad=oku.nextLine();
        System.out.print("soyadınızı giriniz:");
        String soyad= oku.nextLine();

        System.out.println("ad soyad = " + ad+" "+soyad);
        String adSoyad=ad.concat(" ").concat(soyad);
        System.out.println("adSoyad = " + adSoyad);





    }
}
