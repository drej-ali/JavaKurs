package Gün12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // girilen bir sayının pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi>0){
            System.out.println("pozitif");//eğer birden fazla satır varsa parantez şart
        }
        else //yukarıdaki olmazsa kaç ihtimal geriye kalıyor

        {
            if (sayi<0){
            System.out.println("negatif");
            }
            else {
            System.out.println("sıfır");
            }
        }


        //diğer temel yöntem

        //        if (sayi>0){
        //            System.out.println("pozitif");}
        //        if (sayi<0){
        //            System.out.println("negatif");}
        //        if (sayi==0){
        //            System.out.println("sıfır");}






    }
}
