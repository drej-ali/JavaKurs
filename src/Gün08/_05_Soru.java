package Gün08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir kelimenin ilk ve son harfini bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("bir kelime giriniz:");
        String kelime= oku.nextLine();

        char ilkHarf=kelime.charAt(0);// index 0 ilk harfi verir
        char sonHarf=kelime.charAt(kelime.length()-1);//kelime uzunluğunun 1 eksigi son indexi verir.

        System.out.println("ilkHarf-sonHarf = " + ilkHarf+"-"+sonHarf);

        // diğer çözüm yolu
        System.out.println("kelimenin ilk ve son harfi = " + kelime.charAt(0)+"-"+(kelime.charAt(kelime.length()-1)));



    }
}
