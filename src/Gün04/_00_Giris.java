package Gün04;

public class _00_Giris {
    public static void main(String[] args) {

        // küçükten büyüğe atılıyor. Genişleterek büyütülüyor.

        byte ogr1Not = 90;

        int notToplam = ogr1Not;   // byte türüne int türünü atamış oldum.
        System.out.println(notToplam);

        ogr1Not = (byte) notToplam;   // int türünü  byte türüne döniştirirken bunu bilerek yaptığımızı belirtmemiz gerekir
        // Bunu atanan değişkenin başına eşitlenen değişken tipi parantez arasına yazılarak yapılır.
        System.out.println(ogr1Not);

    }
}
