package Gün12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // match.max yöntemi ile girilen 3 sayıdan büyük olanı yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz");
        int s1= oku.nextInt();
        System.out.print("sayı giriniz");
        int s2= oku.nextInt();
        System.out.print("sayı giriniz");
        int s3= oku.nextInt();

        //1. yöntem
        int enb=Math.max(s1,s2);
        enb=Math.max(enb,s3);
        System.out.println("enb = " + enb);

        //2. yöntem
        int enb2=Math.max(s1,Math.max(s2,s3));
        System.out.println("enb2 = " + enb2);

        //3. yöntem en kısası
        System.out.println("büyük olan sayı = " + Math.max(s2,Math.max(s2,s3)));







    }
}
