package Gün16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {

        // 2 ler çarpım tablosunu, tablo olarak yazdırınız.
        //2*1=2
        //....
        //2*10=20
        for (int j = 1; j < 10; j++) {
            //1 için çalışacak sonra 2 sonra 3 için....
            for (int a = 1; a <= 10; a++) {
                System.out.println(j + " x " + a + " = " + (j * a));
            }
            System.out.println();
        }
    }
}






