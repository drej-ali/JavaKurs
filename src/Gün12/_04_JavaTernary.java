package Gün12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız.
        // tek ise "tek" atayınız ve ekrana yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı girniz:");
        int sayi= oku.nextInt();
        
        //klasik yöntem
        if (sayi%2==1)
            System.out.println("tek");
        else 
            System.out.println("çift");
        
        //tek satırda yazma yöntemi:Ternary
        String sonuc= (sayi%2==1)? "tek": "çift";
        System.out.println("sonuc = " + sonuc);
        //şart doğru ise ilk bölüm değilse son bölüm çalışır



        //tek başına bu aşağıdaki de yeterli
        System.out.println(((sayi%2==1)? "tek": "çift"));




    }
}
