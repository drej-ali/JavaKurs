package Gün11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi<0){sayi*=-1;}

        if (sayi%2==1){System.out.println("TEK");}
        else {System.out.println("ÇİFT");}



    }
}
