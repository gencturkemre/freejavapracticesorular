package day1;

import java.util.Scanner;

public class C19_Stringmanipulations {
    public static void main(String[] args) {

         /*
        kullanıcıdan 4 kelime isteyin
        cümle düzenine göre yazdırın
       Örnek: Cümle düzeni bu şekilde.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. kelimeyi giriniz");
        String kelime1=scan.next();
        System.out.println("lütfen 2. kelimeyi giriniz");
        String kelime2=scan.next();
        System.out.println("lütfen 3. kelimeyi giriniz");
        String kelime3=scan.next();
        System.out.println("lütfen 4. kelimeyi giriniz");
        String kelime4=scan.next();

        String yeniKelime1=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1);
        String yeniKelime2=kelime2.toLowerCase();
        String yeniKelime3=kelime3.toLowerCase();
        String yeniKelime4=kelime4.toLowerCase() + "." ;


        System.out.println("cümle = " + " "+ yeniKelime1 +" "+ yeniKelime2 +" "+yeniKelime3 +" "+ yeniKelime4);

    }
}
