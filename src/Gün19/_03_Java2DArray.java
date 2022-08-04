package Gün19;

import java.util.Scanner;

public class _03_Java2DArray {
    public static void main(String[] args) {

        int[] dizi1 = new int[3]; //1 boyutlu 3 tane elamanı var
        int[] dizi2 = {34, 56, 77}; //1 boyutlu diziyi başlangıç değerleri vererek tanımladık.

        //2 ders, 3 öğrencilik bilgileri birarada tutacak tablo lazım
        int[][] tablo1 = new int[2][3];// 2 satır 3 sutunluk veri, yani 6 elemanlı bir tanımlama yapınız.
        int[][] tablo2 = {{23, 44, 55}, {45, 66, 77}};

        for (int satır = 0; satır < 2; satır++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.println(satır + "," + sutun + " = " + tablo2[satır][sutun]);
            }
        }

        int toplam = 0;
        for (int satır = 0; satır < 2; satır++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                toplam = toplam + tablo2[satır][sutun];
            }

            System.out.println("toplam = " + toplam);


        }
    }}
