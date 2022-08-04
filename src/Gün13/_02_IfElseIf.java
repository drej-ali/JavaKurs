package Gün13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        //girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        //toplama için T, çıkarma için Ç, çarpma için P, bölmme için B,
        //harflerini alarak isteğe uygun olan işlemi yaptırıp
        //sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int s1= oku.nextInt();

        System.out.print("ikinci sayıyı giriniz:");
        int s2= oku.nextInt();

        System.out.println("Toplama T\nÇıkarma Ç\nÇarpma P\nBölme B\nGiriniz:");
        Scanner okuStr=new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam = " + (s1+s2));
        else
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma = " + (s1-s2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("çarpma = " + s1*s2);
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println("bölme = " + s1/s2);
                    else
                        System.out.println("hatalı seçim.");







    }
}
