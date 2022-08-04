package Gün16;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        //aşağıdaki görğntğyğ veren programı yazdırınız.(yalnızca 1 yıldız ile yazınız)
        //*****       1. satırda 5 tane
        //****        2. satırda 4 tane
        //***         3. satırda 3 tane
        //**          4. satırda 2 tane
        //*           5. satırda 1 tane

        for (int a = 5; a >= 1; a--) { // 5 4 3 2 1

            for (int k = 1; k <= a; k++) // veya k<=a yerine yukarıyı hiç bozmadan (6-a) da yazılabilir
                System.out.print("*");

            System.out.println();
        }






    }
}
