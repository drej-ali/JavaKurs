package Gün14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayıların toplamını bularak yazınız
        //girilen sayı dahil

        int toplam=0;
        int sayac=1;

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();

        while (sayac<=sayi){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
