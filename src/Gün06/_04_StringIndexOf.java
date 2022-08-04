package Gün06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        //Verilen karakter(lerin) string içindeki INDEXini verir.
        //Merhaba kelimesindeki r nin indexini bulmak istersek kelime.IndexOf("r") -> 2 verir.
        //Merhaba kelimesinde ha nın indexini bulmak için kelime.IndexOf("ha) -> 3 verir.
        //Merhaba kelimesinde a nın indexini bulmak için kelime.IndexOf("a")-> ilk bulduğu nun INDEXini verir -> 4.
        //eğer bulamazsa hata vermez. -1 gönderir bulunamadı manasında.

        String kelime="Merhaba Dünya";

        System.out.println("kelime = " + kelime.indexOf("r"));//2
        System.out.println("kelime = " + kelime.indexOf("ha"));//3
        System.out.println("kelime = " + kelime.indexOf("a"));//4
        System.out.println("kelime = " + kelime.indexOf("ny"));//10
        System.out.println("kelime = " + kelime.indexOf(" "));//7
        System.out.println("kelime = " + kelime.indexOf("A"));//-1
        System.out.println("kelime = " + kelime.indexOf("a",5)); // 5 ten sonrakileri araştırır.
    }
}
