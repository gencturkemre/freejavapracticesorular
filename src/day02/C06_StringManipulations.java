package day02;

import java.util.Scanner;

public class C06_StringManipulations {
    public static void main(String[] args) {


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kelime giriniz");
        String str = scan.nextLine();

        if (str.contains(" ")) {
            System.out.println("evet boşluk var");
        }
        if (str.isBlank()) {
            System.out.println("kelime boşluklardan oluşuyor");
        }
        if (str.isEmpty()) {
            System.out.println("sanırım yazmayı unuttunuz");
        }
    }
}

