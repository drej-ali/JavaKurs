package Gün14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanıcıdan x girilene kadar ekrana "program çalışıyor" yazan
        // ve x girildiğinde ise "program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);
        String text="";
        //String text; te diyebiliriz atama yapmazsak boş kalır

        do {
            System.out.println("Program Çalışıyor");
            System.out.print("Karakter Giriniz:");
            text = oku.nextLine();
        } while (!text.equalsIgnoreCase("x"));
                //text.equalsIgnoreCase("x")!=true; diğer şekil
                //text.equalsIgnoreCase("x")==false;

        System.out.println("Program bitti.");


    }
}
