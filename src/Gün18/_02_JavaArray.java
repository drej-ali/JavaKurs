package Gün18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle= oku.nextLine();
        int adet=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' ')
                adet++;
        }
        System.out.println("kelime sayısı = " + (adet+1));




    }
}
