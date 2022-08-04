package Gün10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçirtiniz
        //küçük ise kaldınız yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("notunuzu giriniz:");
        int not= oku.nextInt();

        if (not>=50){
            System.out.print("GEÇTİNİZ.TEBRİKLER :)");
        }
        if (not<50){
            System.out.print("KALDINIZ.ÜZGÜNÜZ :(");
        }



    }
}
