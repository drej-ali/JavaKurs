package Gün12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        //girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        //kullanıcı bilirse tebrikler yazınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("kaça kadar sayı tutalım:");
        int limit= oku.nextInt();

        int randomSayi=(int)Math.random()*(limit+1);

        System.out.print("tahmininizi giriniz:");
        int tahmin= oku.nextInt();

        //1. yöntem
        if (tahmin==randomSayi)
            System.out.println("tebrikler.");
        else
            System.out.println("tekrar deneyiniz.");

        //2. yöntem
        System.out.println((limit==tahmin) ? "tebrikler" : "tekrar deneyiniz");




    }
}
