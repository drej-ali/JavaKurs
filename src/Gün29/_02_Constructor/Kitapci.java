package Gün29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        // 1.Constructor
        Kitap kit1=new Kitap();
        kit1.name="İnce Mehmet";
        kit1.publishYear=1990;
        kit1.author="Yaşar Kemal";

        // 2.Constructor
        Kitap kit2=new Kitap("Nutuk", 1927, "Atatürk");

        //3.Constructor
        Kitap kit3=new Kitap("Nutuk", 1927);

        kit1.Yazdir();
        kit2.Yazdir();
        kit3.Yazdir();

        System.out.println(kit1);
        // zaten herzaman ekrana yazacağı zaman
        // toString metodunu arar
        String yazıHali=kit2.toString();




    }
}
