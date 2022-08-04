package Gün20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        // bu dizininde en küçük, en büyük elemanını ve ortalamasını bulunuz.

        int[] dizi = new int[5];

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz:");
            dizi[i] = oku.nextInt();
        }
        enb(dizi);
        enk(dizi);
        ort(dizi);

        int[] diziKare=new int[5];
        for (int i = 0; i < diziKare.length; i++) {
            diziKare[i]=dizi[i]*dizi[i];
        }
        enb(diziKare);
        enk(diziKare);
        ort(diziKare);


    }
        public static void enk(int[] dizi){
            int enk = dizi[0];
            for (int i = 0; i < 5; i++) {
                if (dizi[i] < enk)
                    enk = dizi[i];
            }
            System.out.println("enk = " + enk);
        }
        public static void enb ( int[] dizi){
            int enb = dizi[0];
            for (int i = 0; i < 5; i++) {
                if (dizi[i] > enb)
                    enb = dizi[i];
            }
            System.out.println("enb = " + enb);

        }
        public static void ort ( int[] dizi){

            int toplam = 0;
            for (int i = 0; i < 5; i++)
                toplam += dizi[i];
            System.out.println("ort = " + toplam / dizi.length);

        }


    }
