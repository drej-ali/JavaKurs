package Gün08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazınız

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();

        int ilkBosluk=cumle.indexOf(" ");

        System.out.println("ilk kelime = " + cumle.substring(0,ilkBosluk));

        //diğer çözüm yolu int olmadan direk bulunabilir
        System.out.println("ilk kelime = " + cumle.substring(0,cumle.indexOf(" ")));

    }
}
