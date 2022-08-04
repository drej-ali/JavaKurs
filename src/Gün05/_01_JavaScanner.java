package Gün05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        //oku ismine bir okuyucu tanımlandı,(Sysyem.in)klavyeden giriş yapmak üzere
        System.out.print("Sayi Giriniz=");
        int sayi=okuyucu.nextInt();
        //oku.next.Int()  ekrana sayıyı aldı ve bizde sayi değğişkenine atadık
        System.out.println("sayi = " + sayi);






    }
}
