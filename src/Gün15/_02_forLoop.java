package Gün15;

public class _02_forLoop {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        int i = 1;
        while (i <= 5) {
            System.out.println("w_i = " + i);
            i++;
        } // 1 2 3 4 5

        // for döngüsü

        for (i = 1; i <= 5; i++) {// for un içinde int gibi tanımlamalar da yapılabilir
            System.out.println("f_i = " + i);
        }


    }
}
