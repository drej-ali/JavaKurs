package Gün06;

import Gün01.Merhaba;

public class _08_StringEquals {
    public static void main(String[] args) {
        // 2 stringin birbirine eşit olup olmadığını kontrol eder
        //sonuç boolen döner

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi); //s1 s2 ye eşit mi

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); //s1 s2 ye eşit mi
        System.out.println("s2.equals(MERHABA) = " + s2.equals("MERHABA")); //S2 "MERHABA" ya eşit mi
    }
}
