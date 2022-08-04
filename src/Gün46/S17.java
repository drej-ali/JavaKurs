package Gün46;

public class S17 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7}; // 0.satır
        arr[1]=new int[]{1,3};  //1.Satır

        for (int[] a:arr){ // a da 1.satır, sonra 2.satır

            for (int i:a){ // i de 1 3 5 7  ,  1 3
                System.out.print(i+" ");
            }

            System.out.println();
        }


    }
}
