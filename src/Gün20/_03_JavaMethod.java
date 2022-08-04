package Gün20;

public class _03_JavaMethod {
    public static void main(String[] args) {

        merhabaYAz();

        ozelMerhabYaz("İsmet");
        ozelMerhabYaz("Mehmet");

        ismeMerhabYaz("ali");
        ismeMerhabYaz("faruk");





    }
    public static void merhabaYAz(){
        System.out.println("Merhaba");
    }
    public static void ozelMerhabYaz(String  isim){
        System.out.println("Merhaba "+isim+" hoşgeldiniz");
    }
    public static void ismeMerhabYaz(String isim1){
        System.out.println(isim1+" merhaba güzel insan");
    }




}
