package Gün05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // kullanıcının alacağı 2 tam sayının toplamını ekrana yazdırınız.
        
        Scanner oku=new Scanner(System.in);
        
        System.out.print("birinci sayı:");
        int sayi1= oku.nextInt();
        
        System.out.print("ikinci sayı:");
        int sayi2= oku.nextInt();
        
        //1. yöntem
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        
        //2. yöntem
        System.out.println("toplam = " + (sayi1+sayi2));

        //string toplama olan durum
        System.out.println("sayi1+sayi2 = " + sayi1+sayi2);//rakamları yanyana yazdı

    }
}
