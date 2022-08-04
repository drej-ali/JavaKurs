package Gün11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir öğrencinin notuna göre 50 den büyük eşit ise geçtiniz
        //küçük ise kaldınız yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("notunuzu giriniz:");
        int not= oku.nextInt();

        if (not>=50){System.out.println("geçtiniz.");}// baklava diliminin evet çıkışı

        //if (not<50){System.out.println("kaldınız.");}
        // if lerde her zaman kontrol edilme durumu vardır.
        //halbuki else lerde yapısındaki if şartı çalıştığında
        //else kontrol edilmesine gerek kalmaz

        else {System.out.println("kaldınız.");}// baklava diliminin hayır çıkışı




    }
}
