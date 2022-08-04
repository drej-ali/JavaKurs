package Gün05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
  //bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz
        Scanner oku=new Scanner(System.in);

        System.out.print("kenar uzunluğu:");
        int kenar= oku.nextInt();

        int cevre=kenar*4;
        int alan=kenar*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
