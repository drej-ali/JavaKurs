package Gün19;

public class _04_Java2DArray {
    public static void main(String[] args) {
        // 2 boyutlu 4x4 diziyi random 1-10 arası sayılarla tanımlayınız.
        // başka döngüde yazdırınız

        int[][] tablo=new int[3][4];

        for (int satır = 0; satır < 3; satır++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                tablo[satır][sutun]=(int) (Math.random()*10);
            }
        }
        for (int satır = 0; satır < 3; satır++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                System.out.print(tablo[satır][sutun]+" ");

            }System.out.println();
        }




    }
}
