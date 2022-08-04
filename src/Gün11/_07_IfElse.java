package Gün11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // girilen yeni bir passwordun kurallara uygunluğunu kontrol ediniz.
        //kurallar:
        //1-en az 8 karakter olmalı
        //2-içinde pass kelimesi olmasın
        //3-en fazla 12 karakter olmalı

        Scanner oku=new Scanner(System.in);
        System.out.print("şifrenizi belirleiyniz:");
        String password= oku.nextLine();

        //password.contains("pass"); //içinde pass kelimesi var mı
                                   // sonucu geçiyorsa true geçmiyorsa false
        //password.contains("pass")==false ile
        //!password.contains("pass") geçiyor değilse aynı durum

        boolean varMi=password.contains("pass");

        if (password.length()>=8 && password.length()<=12 && password.contains("pass")==false){
            System.out.print("kurallara uygun.");}
        else {
            System.out.print("kurallara uygn değil.");}



    }
}
