package Gün25;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk = new TreeMap<>();

        Scanner okuInt = new Scanner(System.in);
        Scanner oku = new Scanner(System.in);
        String kelime;
        String anlami;
        int secim;
        do {
            System.out.println("MENÜ\n1- Ekleme\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış");
            secim = okuInt.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kelimeyi giriniz=");
                    kelime = oku.nextLine();
                    System.out.print("Anlamını giriniz=");
                    anlami = oku.nextLine();
                    sozluk.put(kelime, anlami);

                    break;
                case 2:
                    // TODO : kelime var mı yokmu kontrolü yapılacak
                    System.out.print("Düzeltilecek Kelimeyi giriniz=");
                    kelime = oku.nextLine();
                    if (sozluk.containsKey(kelime)) {
                        System.out.print("Anlamını giriniz=");
                        anlami = oku.nextLine();
                        sozluk.put(kelime, anlami);
                        break;
                    } else {
                        System.out.print("kelime sozlukte yer almıyor.");
                        break;
                    }
                case 3:
                    System.out.println("sozluk = " + sozluk);
                    break;
                case 4: // Arama işlemleri : kelimenin bir kaç harfini girdiğinde yine en yakın kelimeyi bulsun
                    System.out.print("aramak istediğiniz kelimeyi ve ya ilk harflerini giriniz:");
                    String arama = oku.nextLine();
                    for (String s : sozluk.keySet()) {
                        if (s.startsWith(arama)) {
                            System.out.println(s + "=" + sozluk.get(s));break;
                        }
                    }break;
                case 5:
                    System.out.print("hangi kelimeyi silmek istersiniz?");
                    String silme = oku.nextLine();
                    if (sozluk.containsKey(silme)) {
                        sozluk.remove(silme);
                        break;
                    } else {
                        System.out.print("silmek istediğiniz kelime sözlükte yer almıyor.");
                        break;
                    }
                case 6:
                    System.out.println("hatalı giriş");break;

            }
        } while (secim < 6);

        // TODO : bütün işlemler burda yapıldıktan sonra , METOD ile bütün işlemleri ayırınız.
    }
}
