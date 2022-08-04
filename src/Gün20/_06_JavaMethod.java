package Gün20;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void toplama() {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = oku.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println();
        System.out.println("toplam = " + toplam);
        System.out.println();
    }

    public static void cikarma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = oku.nextInt();
        int cikartma = sayi1 - sayi2;
        System.out.println();
        System.out.println("cikartma = " + cikartma);
        System.out.println();
    }

    public static void carpma() {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = oku.nextInt();
        int carpim = sayi1 * sayi2;
        System.out.println();
        System.out.println("carpim = " + carpim);
        System.out.println();
    }

    public static void bolme() {
        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2 = oku.nextInt();
        int bolum = sayi1 / sayi2;
        System.out.println();
        System.out.println("bolum = " + bolum);
        System.out.println();
    }

    public static void faktoriyel() {
        Scanner oku = new Scanner(System.in);
        System.out.print("sayıyı giriniz:");
        int sayi1 = oku.nextInt();
        int fakt = 1;
        for (int i = 1; i <= sayi1; i++)
            fakt *= i;
        System.out.println();
        System.out.println("fakt = " + fakt);
        System.out.println();
    }

    public static void cikis() {
        System.exit(1);
    }

    public static void main(String[] args) {

        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
// her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        while (true) {
            Scanner oku = new Scanner(System.in);
            System.out.print("1-toplama\n" +
                    "2-çıkarma\n" +
                    "3-çarpma\n" +
                    "4-bolme\n" +
                    "5-Faktöryel\n" +
                    "6-Çıkış");
            System.out.println();
            System.out.print("yapmak istediğiniz işlemin sayısını giriniz:");
            int islem = oku.nextInt();
            switch (islem) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    faktoriyel();
                    break;
                case 6:
                    cikis();
                    break;
            }
        }


    }
}
