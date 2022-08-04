package Gün13;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        //Soru: kullanıcıdan Fizik:90 şeklinde not bilgisi alınız
        //>=90 için A
        //>=80 için B
        //>=70 için C
        //>=60 için D
        //>=40 için E
        //<40 için F yazıdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Dersi ve Notunuzu giriniz:");
        String dersVeNotu = oku.nextLine(); //Fizik: 45, Kimya-80, Türkçe 70

        String ders = dersVeNotu.replaceAll("[0-9]", "");//rakamları sil
        int not = Integer.parseInt(dersVeNotu.replaceAll("[^0-9]", "")); //rakamlar dışındakileri sil

        System.out.println("ders = " + ders);
        System.out.println("not = " + not);

        if (not >= 90)
            System.out.println("A");
        else if (not >= 80)
            System.out.println("B");
        else if (not >= 70)
            System.out.println("C");
        else if (not >= 60)
            System.out.println("D");
        else if (not >= 40)
            System.out.println("E");
        else
            System.out.println("F");


    }
}
