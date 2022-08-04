package Gün10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının negatif mi pozitif mi olduğunu yazdırınız.
        // ıfır ise ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi>0){
            System.out.print("pozitif");
        }
        if (sayi<0){
            System.out.print("negatif");
        }

        if (sayi==0){
            System.out.print("sayı=sıfır");
        }





    }
}
