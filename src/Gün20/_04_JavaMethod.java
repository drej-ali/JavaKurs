package Gün20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekMiCİftMi(3);
        tekMiCİftMi(3);
        tekMiCİftMi(55);
        tekMiCİftMi(66);

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int okunanSayi= oku.nextInt();
        tekMiCİftMi(okunanSayi);

        tekMiCİftMiOku();

    }

    public static void tekMiCİftMi(int sayi) {
        if (sayi % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }
    public static void tekMiCİftMiOku() {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi= oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }


}
