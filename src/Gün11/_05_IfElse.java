package Gün11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        //"study" kelimesi geçiyorsa ekrana evet yazdırın
        //değilse hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();

        if (cumle.length()>10 && cumle.contains("study")){System.out.print("EVET");}
        else {System.out.print("HAYIR");}



    }
}
