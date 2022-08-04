package Gün15;

public class _09_GununSorusu {
    public static void main(String[] args) {
        //0-255 e kadar olan harflerin, sayı ve harf değerini ekrana yazdırınız.

        for (int a=0; a<=255;a++){

            char harf=(char) a;// pc artık bu sayının tablodaki karakter karşılığını anlıyor

            System.out.println(a+"- " + harf);

        }




    }
}
