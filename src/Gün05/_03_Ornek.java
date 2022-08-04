package Gün05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //kullanıcının adını ve soyadını alarak ekrana yazdırınız.

        Scanner oku=new Scanner(System.in); //okuyucuyu bir kere tanımlamamız gerekiyor

        System.out.print("adınızı soyadınızı giriniz:");//ekrana gelen veri girişinin ne için olduğunu
        //kullanıcıya belirtmek için .aslında zorunlu değil."ln" yi sildik çünkü kursor yanınnda kalsın

        String adSoyad=oku.nextLine();//okuma işi bu noktada yapılıyor.bizde okunan değeri değişkene eşitliyoruz

        System.out.println("adSoyad = " + adSoyad);//okunan değer doğru mu okundu diye ekrana yazdırıyoruz.




    }
}
