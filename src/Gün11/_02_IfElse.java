package Gün11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // girilen vize %40 final notunu%60 okuyarak ortalamayı bulunuz
        //ort 60 tan büyük ise geçtiniz
        //değilse bütünlemeye kaldınız yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("vize notunuzu giriniz:");
        int vize= oku.nextInt();
        System.out.print("final notunuzu giriniz:");
        int fnal= oku.nextInt();

        //eğer sonucu double istiyorsak double a eşitleyelim
        //eğr int istiyorsak int e eşitleyelim
        double gecmeNotu=vize*0.4+fnal*0.6;
        //int gecmeNotu=(int)(vize*0.4)+(int)(fnal*0.6);

        if (gecmeNotu>=60){System.out.println("geçtiniz,,ort:"+gecmeNotu);}
        else {System.out.println("bütünlemeye kaldınız,ort:"+gecmeNotu);}


    }
}

