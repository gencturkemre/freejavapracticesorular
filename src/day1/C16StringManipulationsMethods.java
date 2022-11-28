package day1;

import java.util.Scanner;

public class C16StringManipulationsMethods {
    public static void main(String[] args) {


        // kullanıcıdan isim ve soy isim alıp, ismin baş harfi büyük, gerisi küçük
        // soyisimin tamamını büyük yazdıran program
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isiminizi giriniz.");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz.");
        String soyisim=scan.nextLine();

        System.out.println("isim soyisim yeni : " +isim.substring(0,1).toUpperCase()+isim.substring(1)+" "+soyisim.toUpperCase());
    }
}
