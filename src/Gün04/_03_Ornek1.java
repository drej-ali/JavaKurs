package Gün04;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farklı (char,int,boolen) tipte değişken tanımlayınız
        // değer atayınız ve ekrana yazınız.
        int sinifNo = 5;
        char subeAdi = 'B';
        boolean gectikmi = true;
        String subeAdi2 = "C";

        System.out.println("sinifNo = " + sinifNo);
        System.out.println("subeAdi = " + subeAdi);
        System.out.println("gectikmi = " + gectikmi);

        System.out.println(sinifNo + "-" + subeAdi2 + ":" + gectikmi);
        // toplama içlerinde bir tane string ifade varsa
        // toplama işlemi yan yana birleştirme işlemine dönüşür.
        System.out.println(sinifNo + subeAdi2 + ":" + gectikmi);


    }
}
