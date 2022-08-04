package Gün08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();

        int birinciBoslukIndex=cumle.indexOf(" ");
        int ikinciBoslukIndex=cumle.indexOf(" ",birinciBoslukIndex+1);// boşluk ara ama benim verdiğim indexten sonra

        System.out.println("ilk iki kelime = " + cumle.substring(0,ikinciBoslukIndex));

        // diğre çözüm yolu
        System.out.println("ilk iki kelime = " + cumle.substring(0,cumle.indexOf(" ",(cumle.indexOf(" ")+1))));



    }
}
