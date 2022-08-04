package Gün03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a=5;  // a degeri asagıdaki parantez bolgesinde gecerli olur.
                  // cunku dısardaki iceriye erisebilir.

        {   // bu parantez arası kendine ozel bolge olusturur. ve buradaki tanımlanan
            // degiskenler sadece burada gecerli olur. Kullanım amacı karısıklıgı azaltmak.
            int b = 5;
            b = 77;
            a = b;
            System.out.println("b = " + b);
            //icerde tanimlanan degiskenler sadece icerde kullanilabilir.
        }

        //System.out.println("b = " + b); //b degiskenine sadece ozel bolgede erisilebilir.
          System.out.println("a = " + a);




    }
}
