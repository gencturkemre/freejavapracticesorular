package day02;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 4 harfli bir kelime giriniz");
        String kelime2 = scan.nextLine();

        if (kelime2.length()==4)
            System.out.print(kelime2.charAt(3));
        System.out.print(kelime2.charAt(2));
        System.out.print(kelime2.charAt(1));
        System.out.print(kelime2.charAt(0));


        System.out.println("lütfen 4 harfli bir kelime giriniz");
        String kelime = scan.nextLine();

        String tersdenKelime=kelime.substring(3)+kelime.substring(2,3)+
                kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("tersdenKelime= " +tersdenKelime);



    }
}
