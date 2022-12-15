package day02;

import java.util.Scanner;

public class C16_LoopsSesliSessizHarf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sesli bir harf giriniz ");
        String girilenHarf = scan.next();

        String sessizHarf = "qzwsxdcrfvtgbyhnmjuklçşpğ";
        String sesliHarf = "aeıouiöü";
        String sayilar = "1234567890";

        if (girilenHarf.length() > 1) {
            System.out.println("birden fazla Harf girdiniz ");
        }
        if (girilenHarf.contains(sayilar)) {
            System.out.println("sayi girdiniz");
        }
        for (int i = 0; i < sesliHarf.length(); i++) {
            if (girilenHarf.equals(sesliHarf.substring(i, i + 1))) {
                System.out.println("sesli Harf girdiniz");
            }
        }
        for (int i = 0; i <sessizHarf.length() ; i++) {
            if (girilenHarf.equals(sessizHarf.substring(i,i+1))){
                System.out.println("Sessiz Harf Girdiniz");

        }
        }
        for (int i = 0; i <sayilar.length() ; i++) {
            if (girilenHarf.equals(sayilar.substring(i,i+1))){
                System.out.println("Sayı Girdiniz");

            }
        }



    }}


