package Gün06;

public class _11_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf gibi çalışır ama sondan itibaren indexi verir.

        String  s1="Merhaba";

        System.out.println("Baştan a nın indexi = " + s1.indexOf("a"));// 4
        System.out.println("Sondan araştırmaya bakarak a nın indexi = " + s1.lastIndexOf("a")); //6
        //index her zaman soldan sayılarak 0 dan itibarendir. Index her zaman tektir.

    }
}
