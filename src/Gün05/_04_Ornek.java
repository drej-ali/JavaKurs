package Gün05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //kullanıcının adını ve soyadını ayrı ayrı okutarak alıp birlikte ekrana yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("adınız:");
        String ad=oku.next();
        System.out.print("Soyadınız:");
        String soyad=oku.next();

        System.out.println("ad ve soyad = " + ad+" "+soyad);





    }
}
