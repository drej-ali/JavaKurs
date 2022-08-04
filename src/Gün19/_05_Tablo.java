package Gün19;

public class _05_Tablo {
    public static void main(String[] args) {
        //{{1,2,3},{2,3,1},{5,5,5},{2,10,3}} int 2D arrayını olusturun.
        //2D arrayınden max number prınt et

        int[][] tablo = {{1, 2, 3},
                         {2, 3, 1},
                         {5, 5, 5},
                         {2, 10, 3}};
        System.out.println("satır sayısı = " + tablo.length); //tablo.length dersek satır uzunluğunu verir.
        System.out.println("1 satırın sayısı = " + tablo[0].length); // bunlarda satırdaki sutun sayısını verir
        System.out.println("2 satırın sayısı = " + tablo[1].length);
        System.out.println("3 satırın sayısı = " + tablo[2].length);
        System.out.println("4 satırın sayısı = " + tablo[3].length);
        //satır yerine tablo.length sutun yerine tablo[i].length yazılabilir

        int enb = tablo[0][0];
        for (int satır = 0; satır < tablo.length; satır++) {
            for (int sutun = 0; sutun < tablo[satır].length; sutun++) {
                if (tablo[satır][sutun] > enb)
                    enb = tablo[satır][sutun];
            }
        }
        System.out.println("enb = " + enb);


    }
}
