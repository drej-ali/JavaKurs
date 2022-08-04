package Gün10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // girilen 3 sayıdan en büyük olanını yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int s1= oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int s2= oku.nextInt();
        System.out.print("3. sayıyı giriniz:");
        int s3= oku.nextInt();

        int enb=s1;

        if (s2>enb){
            enb=s2;
        }
        if (s3>enb){
            enb=s3;
        }

        System.out.println("enb = " + enb);






    }
}
