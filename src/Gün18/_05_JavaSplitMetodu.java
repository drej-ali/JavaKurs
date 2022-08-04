package Gün18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // bir stringi parçalara ayırmak demek

        //kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle= oku.nextLine();

        String [] kelimeler=cumle.split(" ");

        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayısı = " + kelimeler.length);

        //alt alta yazmak için

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);

        }
    }
}
