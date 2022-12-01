package day02;

import java.util.Scanner;

public class C05_StringManipulations {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("lütfen soyIsminizi giriniz");
        String soyIsim=scan.nextLine();

        if (isim.length()> soyIsim.length() ) System.out.println("isminiz soyisminizden uzun = " + isim);
        else if (soyIsim.length()>isim.length())
            System.out.println("soyIsim = " + soyIsim);
        else System.out.println("isim soyisim aynı uzunlukta");
        }
    }

