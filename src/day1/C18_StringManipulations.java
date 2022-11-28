package day1;

import java.util.Scanner;

public class C18_StringManipulations {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir kelime isteyin, eğer kelime üç veya üç'ten fazla harften oluşuyorsa,
        ilk iki harfi 3 kere yazdırın,
        diğer durumda  kelimeyi yazdırın
        ali >> alalal
        al >> al
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1 kelime giriniz");
        String kelime=scan.nextLine();
        if (kelime.length()>=3){
            System.out.print(kelime.substring(0,2));
            System.out.print(kelime.substring(0,2));
            System.out.print(kelime.substring(0,2));

        }else System.out.println("kelime = " + kelime);


    }
}
