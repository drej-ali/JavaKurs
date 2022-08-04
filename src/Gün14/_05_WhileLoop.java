package Gün14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {

        // girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        //toplamını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();
        int sayac=1;
        int toplam=0;

        while (sayac<=sayi){
            if (sayac%2==1){
                toplam=toplam+sayac;
            }
            sayac++;
        }
        System.out.println("toplam = " + toplam);

        // 2.yol
        sayac=1;
        toplam=0;

        while (sayac<=sayi){
            toplam=toplam+sayac; //
            sayac=sayac+2;
        }
        System.out.println("toplam = " + toplam);



    }
}
