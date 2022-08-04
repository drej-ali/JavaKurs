package Gün07;

import java.util.Locale;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase: stringi küçük harfe çevirir.
        
        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);  //Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); //merhaba dünya

        // önce küçüğe çevirdik sonra kontrol ettik "me " ile
        System.out.println("text büyük veya küçük harf te olsa me ile başlıyor mu?" +  text.toLowerCase().startsWith("me"));
        
        
        
    }
}
