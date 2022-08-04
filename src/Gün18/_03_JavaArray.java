package Gün18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz
        // sonrasında en büyük elemanın indexini bulunuz.

        int[] dizi = new int[100];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }

        int enb = dizi[0]; // diziden birini enb ye atadıkki kendi aralarında kıyas yapabilelim
        int enbIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];
                enbIndex = i;
            }
        }


        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);


    }
}
