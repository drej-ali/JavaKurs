package Gün21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static int enbBul(int s1, int s2) {
        if (s1 > s2)
            return s1;
        else
            return s2;

    }

    public static void main(String[] args) {
        // kullanıcının  gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        //yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int s1 = oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int s2 = oku.nextInt();
        // üstteki kısım yerine metod yazılıp int cinsinde sayıOku diyerek her seferinde sayı okutulabilir
        //public static int sayiOku(){
        //Scanner oku=new Scanner(System.in);
        //System.out.print("Sayı = ");
        //return oku.nextInt();

        int enb = enbBul(s1, s2);
        System.out.println("enb = " + enb);

        //_01_JavaMethod.enbBul(sayi1,sayi2); aynı paketin içinden fonksiyon çağırma
        //Gun20._06_JavaMethod.faktoryelYaz(sayi1); diğer paketten çağırma


    }
}
