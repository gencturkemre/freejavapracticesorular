package day1;

import java.util.Scanner;

public class C14_StringManipulations {
    public static void main(String[] args) {


        // kullanıcıdan ismini ve soy ismin sorun, bütün ismini büyük harf ile yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ismini gir");
        String isim=scan.nextLine();
        System.out.println("lütfen soy ismi gir");
        String soyIsmi=scan.nextLine();
        System.out.println(isim.toUpperCase()+ " " +soyIsmi.toUpperCase());


    }


}
