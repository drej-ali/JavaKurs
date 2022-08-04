package Gün04;

public class _06_SayiKelime {
    public static void main(String[] args) {

        String girilenKelime="65"; //bu haliyle mesela Ahmet kelimesinde farksız toplama yapılamaz.
        System.out.println("girilenKelime = " + girilenKelime);

        //Kelime-> sayıya çevrilmesi

        int intDeger=Integer.parseInt(girilenKelime);
        double doubleDeger= Double.parseDouble(girilenKelime);


        System.out.println("intDeger = " + intDeger);
        System.out.println("doubleDeger = " + doubleDeger);

        //Bu gün hava 15 derece.görüntü rakam olsa bile toplanamadığı için yazıdır
        //burada kelime olarak geçiyor.
        //aslında bunu on beş gibi düşünebiliriz.
        //Bu -> Kelime
        //gün -> kelime
        //hava ->kelime
        //15 -> kelime   toplama yapamazsın bu yüzden
        //int dereceSayi= Integer.parseInt(dereceYazi);

        /* Rakamı yazıya çevirmek diyelim */
        // Hava sıcaklığını rakam olarak tanımlayınız ve
        // bir cümle şeklinde bugun hava 12 derece şeklinde yazınız.
        int sicaklik=12; //toplanabilir.

        System.out.println("bugün hava "+sicaklik+" derece");

        String sicaklikKelimeHali=Integer.toString(sicaklik); //kelimeyi rakama çevirdik. toplanamaz
        // int toplam=sicaklikKelimeHali+sicaklikKelimeHali; //toplanamaz

        System.out.println("Bugün hava "+sicaklikKelimeHali+" derece.");          // otomatik hali
        System.out.println("Bugün hava "+Integer.toString(sicaklik)+" derece.");  // dönüştürüldü.





    }
}
