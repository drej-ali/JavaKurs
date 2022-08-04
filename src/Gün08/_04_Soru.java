package Gün08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //girilen bir password un sizin bildiğiniz bir kelimeyle
        // eş olup olmadığını bulunuz
        //şifre=bayrak

        String gizliSifre="bayrak";

        Scanner oku=new Scanner(System.in);
        System.out.print("şifrenizi giriniz:");
        String girilenSifre= oku.nextLine();

        System.out.println("Şifre geçerli mi = " + gizliSifre.equals(girilenSifre));
        System.out.println("Şifre geçerli mi = " + girilenSifre.equals(gizliSifre));
        System.out.println("Şifre geçerli mi = " + girilenSifre.equalsIgnoreCase(gizliSifre));






    }
}
