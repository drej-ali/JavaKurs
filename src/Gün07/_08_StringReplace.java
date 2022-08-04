package Gün07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace:  bir stringin içindeki istenen karakterin(lerin) hepsini verilen yenisi ile değiştirir.

        String text="Merhaba Dünya";

        System.out.println("orijinal hali = " + text);
        System.out.println("a -> e  = " + text.replace("a","e")); //Merhebe Dünye
        System.out.println("ba -> de = " + text.replace("ba","de"));//Merhade Dünya
        System.out.println("Dünya -> Java = " + text.replace("Dünya","Java"));//Merhaba Java
        System.out.println("a ları silelim = " + text.replace("a",""));//Merhb Düny





    }
}
