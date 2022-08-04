package Gün17;

public class _03_JavaArray {
    public static void main(String[] args) {

        int[] dizi1 = new int[5]; // 0,1,2,3,4

        int[] dizi2 = {5, 77, 67, 8, 99, 0, 4, 555}; //hem uzunluğu hem de değerleri verildi. uzunluk=eleman sayısı

        String[] kelimeler = new String[5]; // 5 tane kelime saklayabilen bir dizi değişkeni

        boolean[] dizi3 = new boolean[5]; // 5 tane boolen saklayabilen bir dizi değişkeni

        double[] oranlar = new double[5]; // 5 tane double cinsi değişken saklayabilen bir dizi değişkeni

        for (int i = 0; i < 5; i++)
            System.out.println("dizi1 = " + dizi1[i]);

        for (int i = 0; i < dizi2.length; i++)
            System.out.println("dizi2 = " + dizi2[i]);

        for (int i = 0; i < 5; i++)
            System.out.println("kelimeler = " + kelimeler[i]);

        for (int i = 0; i < 5; i++)
            System.out.println("dizi3 = " + dizi3[i]);

        for (int i = 0; i < 5; i++)
            System.out.println("oranlar = " + oranlar[i]);

         // fori enter yapınca kalıp hazır çıkıyor


    }
}
