package Gün05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan kaç bilet istediğini(byte) ve sigorta isteyip istemediğini(boolen olarak) alıp ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kaç bilet istersiniz:");
        byte biletSayisi= oku.nextByte();

        System.out.print("Sigorta ister misiniz?");
        boolean sigortaVarMi=oku.nextBoolean();

        System.out.println("biletSayisi = " + biletSayisi +" "+ "Sigorta = " +  sigortaVarMi);




    }
}
