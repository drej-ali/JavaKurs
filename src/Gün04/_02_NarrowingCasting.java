package Gün04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int)oran;  //Double tipindeki 3.2 değeri int tipine atıldı. bu tip dönüşüme daraltma yönünde olduğundan
                        // Narrowing Casting denir. Diğer adıyla extra işlem yapıldığından manuel dönüşüm de denir.
        System.out.println("sayi = " + sayi);









    }
}
