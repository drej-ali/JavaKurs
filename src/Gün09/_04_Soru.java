package Gün09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz
        // mesela 524->425

        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz:");
        int sayi= oku.nextInt();

        // 524, 5 2 4 ü ayırmam lazım -> 4*100+2*10+5
        int birlerbas=sayi%10;
        int onlarbas=sayi/10%10;
        int yuzlerbas=sayi/100;

        int tersi=birlerbas*100+onlarbas*10+yuzlerbas;
        System.out.println("tersi = " + tersi);

        //diğer çözüm yolu
        System.out.println("sayının tersi = " + (birlerbas*100+onlarbas*10+yuzlerbas));




    }
}
