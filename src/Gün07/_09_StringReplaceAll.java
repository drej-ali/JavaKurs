package Gün07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // replaceAll: replace gibi çalışıyor, farkı kriter(Regex)
        // regex : regular expression / düzenli ifade
        // TODO (yapılacak) : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya";

        System.out.println("text = " + text);

        // a,b,n karakterlerini ayrı ayrı bul ve _ ile değiştir.
        System.out.println("a,b,n -> _ =" + text.replaceAll("[abn]","_"));

        //büyük harfleri _ ile değiştir
        System.out.println("büyük harfler-> = " + text.replaceAll("[A-Z]","_"));




    }
}
