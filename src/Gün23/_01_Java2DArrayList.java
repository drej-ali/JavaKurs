package Gün23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrayList {
    public static void main(String[] args) {
        //***************************/
        int sayi = 5;  // tek bir rakam saklayabilen değişken.
        int[] dizi = new int[20]; // 20 adet sayı saklayabilen değişken
        int[][] tablo = new int[20][4]; // 20x4 tane sayı sakaylabilen bir değişken.

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken.
        //***************************/

        // 3 öğrencinin mat fiz kimya notlarını tek bir yerde birleştireceğiz
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();//Listelerin listesi
        // bunun her bir elemanı ArrayList.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);
        matNotlar.add(90);

        ArrayList<Integer> fizNotlar = new ArrayList<>();
        fizNotlar.add(65);
        fizNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(85);
        kimNotlar.add(95);
        kimNotlar.add(55);

        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        notlarListesi.get(0);  // her bir elemanı bir liste
        notlarListesi.get(0).get(0); // 0.Listenin 0.elemanını veririr.

        System.out.println("notlarListesi = " + notlarListesi.get(0)); // 0.listeyi yazdırır.
        System.out.println("notlarListesi = " + notlarListesi.get(1)); // 1.listeyi yazdırır.
        System.out.println("notlarListesi = " + notlarListesi.get(2)); // 2.listeyi yazdırır.

        // ykarıdak,lerin yerine bu döngü
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        // tum notlar tek tek nasıl yazdırılır.
        for (int i = 0; i < notlarListesi.size(); i++) {  // liste uzunluğu  yani yaprak sayısı

            System.out.println(dersler.get(i));// ders isimlerini yazdık
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // her bir listedeki not ların sayısı
                System.out.print((i + 1) + ".yaprak, " + (j + 1) + ".not=");
                System.out.println(notlarListesi.get(i).get(j));   //satır sütun yapısı tablo[i][j]

            }
        }

        //Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //        yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("DersNo (0-Mat, 1-Fiz, 2- Kim) :");
        int dersNo = oku.nextInt();
        dersNotlariniYazdir(notlarListesi, dersNo);  // gönderme  - Hoca

        //Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        int ort = dersOrtalamaBul(notlarListesi, dersNo);
        System.out.println("ort = " + ort);


        //Soru 3 : Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.

        double ortalama = tumOrtBul(notlarListesi);
        System.out.println("Tüm Derslerin Ortalaması = " + ortalama);

        // Soru 4 : En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon yok)

        int enb = enb = notlarListesi.get(0).get(0);
        int enk = enk = notlarListesi.get(0).get(0);
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                if (enb < notlarListesi.get(i).get(j))
                    enb = notlarListesi.get(i).get(j);
                if (enk > notlarListesi.get(i).get(j))
                    enk = notlarListesi.get(i).get(j);
            }
        }
        System.out.println("enk = " + enk);
        System.out.println("enb = " + enb);


    }

    // fonksiyona notlıstesı ve dersno gidecek, ort dönecek
    public static int dersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {

        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++)
            toplam = toplam + notlarListesi.get(dersNo).get(i);

        return toplam / notlarListesi.get(dersNo).size();
    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> dersNotlari, int dersNo) {  // alma kısmı - Ramazan
        for (int i = 0; i < dersNotlari.get(dersNo).size(); i++)
            System.out.println(dersNotlari.get(dersNo).get(i));
    }

    public static double tumOrtBul(ArrayList<ArrayList<Integer>> notlarListesi) {
        double toplam = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                toplam += notlarListesi.get(i).get(j);

            }
        }
        return toplam / notlarListesi.size();
    }


}















