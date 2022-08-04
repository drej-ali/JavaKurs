package Gün04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // kişinin ağırlığını double boyunu int olarak değerler veriniz
        //ve bir satırda boyunuz.... ve kilonuz.... şeklinde yazınız.
        double kilo=74.5;
        int boy= 180;
        double vki1=kilo/boy/boy;
        int vki2=(int)kilo/boy/boy;

        System.out.println("boyunuz="+boy+" "+"kilonuz="+kilo);
        System.out.println("vki1 = " + vki1);
        System.out.println("vki2 = " + vki2);
    }
}
