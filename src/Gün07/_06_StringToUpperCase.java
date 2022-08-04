package Gün07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //ToUpperCase: stringi büyük harfe çeviriyor.

        String  text="Merhaba Dünya";

        System.out.println("orijinal hali = " + text);//Merhaba Dünya
        System.out.println("text in büyük hali = " + text.toUpperCase()); //MERHABA DÜNYA

        // büyük veya küçük farketmeksizi ya ile bitiyor mu?
        System.out.println("sonuç = " + text.toUpperCase().endsWith("YA")); // true
        //veya
        System.out.println("sonuç = " + text.toLowerCase().endsWith("ya")); // true




    }
}
