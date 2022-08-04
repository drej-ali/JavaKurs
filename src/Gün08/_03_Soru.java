package Gün08;

import java.util.Locale;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilen bir kelimedeki A harfi sayısını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();
        String cumle1=cumle.toUpperCase();

        int uzunluk1=cumle1.length();
        int uzunluk2=cumle1.replaceAll("A","").length();

        //diğer çözüm yolları:
        int uzunluk3=cumle.replace("A","").replace("a","").length();//A ve a karakterlerini silip cümle uzunluğunu bulduk
        int uzunluk4=cumle.toUpperCase().replace("A","").length();//a harflerinin hepsini büyülttük sonra hepsini silip cumle uzunluğunu bulduk
        int uzunluk5=cumle.toLowerCase().replace("a","").length();//a harflerinin hepsini küçülttük sonra hepsini silip cumle uzunluğunu bulduk
        int uzunluk6=cumle.replaceAll("[Aa]","").length();//a lar olmadan cümle uzunluğu

        System.out.println("A harfi sayısı="+(uzunluk1-uzunluk2));
        System.out.println("A harfi sayısı="+(uzunluk1-uzunluk3));
        System.out.println("A harfi sayısı="+(uzunluk1-uzunluk4));
        System.out.println("A harfi sayısı="+(uzunluk1-uzunluk5));
        System.out.println("A harfi sayısı="+(uzunluk1-uzunluk6));
        
        
        
    }
}
