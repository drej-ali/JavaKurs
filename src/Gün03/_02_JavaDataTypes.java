package Gün03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {

                //   default olarak tam sayıların tamamını INT kabul eder
                byte byteDeger=7;
                short shortDeger=1645;
                int intDeger=25000;
                long longDeger=2345121542315L;


               //   default olarak ondalıklı sayıların hepsini DOUBLE kabul eder
                float floatDeger=3.1400000F;           // ondalıklı sayıları default olarak DOUBLE kabul ettiğinden
                                                       // sonuna F eklendi, sayıya hiçbir etkisi yok.
                double doubleDeger=3.14000000000000;   // her iki tarafta DOUBLE olduğundan ek bilgiye ihtiyaç yoktur.

                char basHarf='A';
                char basHarf2=65;           // karakter tablosunda A harfi 65 e denk geliyorsa sayısını da atayabiliriz.
                boolean evetMi=true;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("basHarf2 = " + basHarf2);
        System.out.println("evetMi = " + evetMi);



















    }








}
