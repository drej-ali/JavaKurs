package Gün12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // otopark ücretleri:
        //3 saate kadar 10 tl, 5 saate kadar 15 tl, 10 saate kadar 20 tl dir.
        //kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("kaç saat park ettiniz:");
        int saat= oku.nextInt();

        if (saat<=3) {
            System.out.println("ücretiniz 10 tl.");
        }
        else { // burası zaten 3 ten büyükse demek
            if (saat<=5){
                System.out.println("ücretiniz 15 tl");}
            else {
                System.out.println("ücretiniz 20 tl");}
        }




    }
}
