package Gün05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        //kişinin ağırlığına double boyuna int olarak değerler veriniz
        //ve bir satırda boyunuz.... ve kilonuz..... şeklinde yazdırınız
        //vki nide bularak yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("ağırlığınız(kg):");
        double kilo= oku.nextDouble();

        System.out.print("boyunuz(cm):");
        int boy= oku.nextInt();

        System.out.println("boyunuz = " + boy+" "+"kilonuz = " + kilo);

        double vki=kilo/boy/boy;
        System.out.println("vki = " + vki);


    }
}
