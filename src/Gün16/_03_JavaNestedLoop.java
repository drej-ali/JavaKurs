package Gün16;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        //aşağıdaki görğntğyğ veren programı yazdırınız.(yalnızca 1 yıldız ile yazınız)
        //*         1. satırda 1 tane
        //**        2. satırda 2 tane
        //***       3. satırda 3 tane
        //****      4. satırda 4 tane
        //*****     5. satırda 5 tane

        for (int a = 1; a <= 5; a++) {

            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
