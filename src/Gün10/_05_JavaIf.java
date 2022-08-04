package Gün10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının sadece birler basamağını yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt()%10;

        //yada
        //int sayi= oku.nextInt();
        //int birler=sayi%10;

        if (sayi==0){System.out.println("sıfır");}
        if (sayi==1){System.out.println("bir");}
        if (sayi==2){System.out.println("iki");}
        if (sayi==3){System.out.println("üç");}
        if (sayi==4){System.out.println("dört");}
        if (sayi==5){System.out.println("beş");}
        if (sayi==6){System.out.println("altı");}
        if (sayi==7){System.out.println("yedi");}
        if (sayi==8){System.out.println("sekiz");}
        if (sayi==9){System.out.println("dokuz");}
    }
}
