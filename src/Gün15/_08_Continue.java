package Gün15;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker ekrana alt alta yazdırınız.
        //boşlukları yazmasın

        Scanner read = new Scanner(System.in);
        System.out.print("string giriniz:");
        String text = read.nextLine();

        for (int a = 0; a <= text.length(); a++) {

            if (text.charAt(a) == ' ') continue;// boşluk geldiğinde continue çaışır
            // ve sonrakiler pas geçilir döngü devam eder

            System.out.println(text.charAt(a));
        }
        // tek bir karakter karşılaştırılıyorsa tek tırnak birden fazla karakter
        // alacaksa çift tırnak kullan


    }
}
