package Gün11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        //"study" kelimesi geçiyorsa ekrana evet yazdırın
        //değilse hayır yazdırınız.
        //bu soruyu büyük küçük harf girilsede doğru çalıstırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();

        if (cumle.length()>10 && cumle.toLowerCase().contains("study")){System.out.print("EVET");}
        else {System.out.print("HAYIR");}




    }
}
