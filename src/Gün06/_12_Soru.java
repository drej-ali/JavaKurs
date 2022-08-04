package Gün06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // girilen bir string te boşluk olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.println("bir string giriniz=");
        String girilen=oku.nextLine();

        System.out.println("boslukVarMi = " + girilen.contains(" "));




    }
}
