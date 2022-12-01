package day02;

import java.util.Scanner;

public class C08_MethodCreationsHesapMakinesi {

    /*
   Problem Tanımı :
   Basit 4 islem yapan bir hesap makinesi kodlayiniz....
   Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
   Kullanicidan iki sayi girmesini isteyiniz.
   Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
 */
    public static void main(String[] args) {

        hesapMakinesi();
    }

    public static void hesapMakinesi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen işlem yapacağınız birinci sayıyı giriniz");
        int sayı1 = scan.nextInt();

        System.out.println("lütfen işlem yapacağınız ikinci sayıyı giriniz");
        int sayı2 = scan.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlem karşısındaki sembolu giriniz: \n" +
                "Toplama: +\n" +
                "Çıkarma: -\n" +
                "Çarpma: *\n" +
                "Bölme: /\n");
        char sembol = scan.next().charAt(0);

        switch (sembol) {

            case '+':
                System.out.println("(sayı1 + sayı2) = " + (sayı1 + sayı2));
                break;
            case '-':
                System.out.println("(sayı1 - sayı2) = " + (sayı1 - sayı2));
                break;
            case '*':
                System.out.println("(sayı1 * sayı2) = " + (sayı1 * sayı2));
                break;
            case '/':
                System.out.println("(sayı1 / sayı2) = " + (sayı1 / sayı2));
                break;
            default:
                System.out.println("yanlış işlem seçimi");

        }
    }
}
