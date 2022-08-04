package Gün12;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Soru: 0 ile 6 arasında random sayı üreten programı yazınız.

        //Math.random ->0.0000 - 9.99999 arasında sayı üretir

        double doubleRandomSayi=Math.random();
        System.out.println("doubleRandomSayi = " + doubleRandomSayi);

        //tam sayı istiyorsak
        int tamSayi=(int)(doubleRandomSayi*6); // 0-5 arasında sayı veriyor. ne istiyorsak bir fazlasını yazmak lazım
        System.out.println("tamSayi = " + tamSayi);

        // en kısa yolu
        System.out.println("tamSayi = " + (int)(doubleRandomSayi*6));


    }
}
