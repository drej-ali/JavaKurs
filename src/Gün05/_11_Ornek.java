package Gün05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan cadde, sokak, posta kodu(int) ve ülke şeklinde adres bilgisi olark yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cadde:");
        String cadde= oku.nextLine();

        System.out.print("Sokak:");
        String  sokak= oku.nextLine();

        System.out.print("Posta Kodu:");
        int pk= oku.nextInt();

        System.out.print("Ülke:");
        String ulke= oku.nextLine();

    }
}
