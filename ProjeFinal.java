import java.util.Scanner;

public class ProjeFinal {
    // 235542022 Muhammet Yahya Tezcan
    public static void main(String[] args) {
         diziOrtalaması();
         enKucukElemanBulma();
         enKucukElemanIndexi();
         birlerBasamağıBulma();
         kucukKarakterleriSay();
         yaziyiTersCevir();
         kucukBuyukCevirici();
         kelimeSayaci();
         ayBulucu();
         okulOrtalamaHesaplayici();
    }

    public static void diziOrtalaması() {
        int[] dizim = { 1, 2, 3, 4, 5, 6 };
        double ort = 0;
        for (int i = 0; i < dizim.length; i++) {
            ort += dizim[i];
        }
        ort = ort / dizim.length;
        System.out.println("Ortalama :" + ort);
    }

    public static void enKucukElemanBulma() {
        int[] dizim = { 110, 21, 13, 44, 25, 65 };
        int enKucuk = dizim[0];
        for (int i = 0; i < dizim.length; i++) {
            if (dizim[i] < enKucuk) {
                enKucuk = dizim[i];
            }
        }
        System.out.println("Dizinin En Kucuk Elemanı : " + enKucuk);
    }

    public static int enKucukElemanBulma(int[] dizi) {
        int[] dizim = { 110, 21, 13, 44, 25, 65 };
        int enKucuk = dizim[0];
        for (int i = 0; i < dizim.length; i++) {
            if (dizim[i] < enKucuk) {
                enKucuk = dizim[i];
            }
        }
        System.out.println("Dizinin En Kucuk Elemanı : " + enKucuk);
        return enKucuk;
    }

    public static void enKucukElemanIndexi() {
        int[] dizim = { 110, 21, 13, 44, 25, 65 };
        int enKucuk = enKucukElemanBulma(dizim);
        for (int i = 0; i < dizim.length; i++) {
            if (dizim[i] == enKucuk)
                System.out.println("En Küçük Sayi " + i + ". Indextedir");
        }
    }

    public static void birlerBasamağıBulma() {
        int sayi = 112;
        int birlerBasamağı = sayi % 10;
        System.out.println(sayi + " Sayısının Birler Basamağı " + birlerBasamağı);
    }

    public static void kucukKarakterleriSay() {
        String cumle = "Bu MetOd CüMLEDEKİ kÜÇÜK HARfLERİN sAYISINI bULUR";
        int sayi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) >= 'a' && cumle.charAt(i) <= 'z') {
                sayi++;
            }
        }
        System.out.println("'" + cumle + "' Cümlesindeki Küçük Harf Sayısı " + sayi);
    }

    public static void yaziyiTersCevir() {
        String cumle = "Merhaba Dünya";
        String ters = "";
        for (int i = cumle.length() - 1; i >= 0; i--) {
            ters += cumle.charAt(i);
        }
        System.out.println("'" + cumle + "' cümlesinin tersi " + ters);
    }

    public static void kucukBuyukCevirici() {
        String cumle = "Bu MeToD cÜMleDeKİ kUCuk HarFlerİ BUyuK BuyUK HArfLeri KucUK yAPAR";
        String sonuc = "";
        for (int i = 0; i < cumle.length(); i++) {
            char harf = cumle.charAt(i);
            if (harf >= 'a' && harf <= 'z') {
                sonuc += (char) (harf - 32);// ASCII
            } else if (harf >= 'A' && harf <= 'Z') {
                sonuc += (char) (harf + 32);// ASCII
            } else {
                sonuc += cumle.charAt(i);
            }
        }
        System.out.println("'" + cumle + "' Cümlesinin Kücük Buyuk Harf Cevrilmiş Hali " + sonuc);
    }

    public static void kelimeSayaci() {
        String cumle = "Merhaba Sivas Merhaba Dünya";
        int sayac = 1;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ' && cumle.charAt(i - 1) != ' ') {
                sayac++;
            }
        }
        System.out.println("'" + cumle + "' Cümlesindeki Kelime Sayısı " + sayac);
    }

    public static void ayBulucu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-12 arasında bir sayı giriniz:");
        int ay = scanner.nextInt();
        scanner.close();
        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Hatalı Giriş");
                break;
        }
    }

    public static void okulOrtalamaHesaplayici() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize Notunu Girin");
        int vize = scanner.nextInt();
        System.out.println("Final Notunu Girin");
        int finalNot = scanner.nextInt();
        scanner.close();
        double ort = vize * 0.40 + finalNot * 0.60;
        if (ort >= 50)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");
        System.out.println("Dönem Ortalamanız " + ort);
    }
}