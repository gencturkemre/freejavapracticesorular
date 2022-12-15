package day02;

import java.util.Scanner;

public class C16_SesliSessizHarf {

      /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

            */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sesli bir harf giriniz ");
        String girilenHarf=scan.next();

        String sessizHarf="qzwsxdcrfvtgbyhnmjuklçşpğ";
        String sesliHarf="aeıouiöü";
        String sayilar="1234567890";

        if (girilenHarf.length()>1){
            System.out.println("Birden fazla harf girdiniz ");
        }
        if (sayilar.contains(girilenHarf)){
            System.out.println("sayi girdiniz");
        }
        if (sesliHarf.contains(girilenHarf)){
            System.out.println(girilenHarf+ " harfi sesli harfdir.");
        }
        if (sessizHarf.contains(girilenHarf)){
            System.out.println(girilenHarf+ " harfi sesiz harftir.");
        }

    }
}
