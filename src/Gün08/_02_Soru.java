package Gün08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir kelimenin boş olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("kelime giriniz:");
        String kelime= oku.nextLine();

        System.out.println("kelime boş mu? = " + kelime.isEmpty());



    }
}

