package day02;

import java.util.Scanner;

public class C15_CarpimTablosuScan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen çarpım tablosunda görmek istediğiniz 1. sayıyı giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lütfen çarpım tablosunda görmek istediğiniz 2. sayıyı giriniz");
        int sayi2=scan.nextInt();

        for (int i = 1; i <= sayi1; i++) {
            System.out.println("------------------");
            for (int j = 1; j <=sayi2 ; j++) {
                System.out.println(i+"*"+j+"="+(i*j) );

            }

        }
    }

}
