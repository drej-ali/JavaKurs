package Gün12;

public class _06_JavaMath {
    public static void main(String[] args) {

        int a=-12;
        int b=4;

        //mutlak değer
        System.out.println("a nın mutlak değeri = " + Math.abs(a));//12
        // iki rakamdan büyük olan
        System.out.println("a ve b den en büyük olan = " + Math.max(a,b));//4
        // üç rakamdan büyük olan
        System.out.println("a b c den en büyük olan = " + Math.max(a,Math.max(a,b)));
        //en küçük olan
        System.out.println("a ve b den en küçük olan = " + Math.min(a,b));//-12
        //karekök
        System.out.println("b nın karekökü = " + Math.sqrt(b));//2
        //kuvveti
        System.out.println("a nın b kuvveti(a üzeri b)= " + Math.pow(a,b));
        //yuvarlama
        System.out.println("round 3.1= " + Math.round(3.1));//3
        System.out.println("round 3.5= " + Math.round(3.5));//4
        //en yakın büyük tam sayı
        System.out.println("ceil 3.1 = " + Math.ceil(3.1)); //4 //bu rakamdan büyük,en küçük tam sayı
        System.out.println("ceil 3.5 = " + Math.ceil(3.5)); //4
        //en yakın küçük tam sayı
        System.out.println("floor 3.1 = " + Math.floor(3.1));//3 //bu rakamdan küçük,en büyük tam sayı
        System.out.println("floor 3.5 = " + Math.floor(3.5));//3









    }
}
