package day02;

import java.util.Scanner;

public class C12_Methods {
    /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz ");
        int sayi = scan.nextInt();
        fibonacciSerisi(sayi);

    }

    public static void fibonacciSerisi(int sayi) {

        int sayi1 = 0;
        int sayi2 = 1;

        if (sayi < 47) {

            System.out.print(sayi1 + "-");
            System.out.print(sayi2 + "-");

            for (int i = 0; i < sayi-2; i++) {

                int sayi3 = sayi1 + sayi2;
                System.out.print(sayi3 + "-");

                sayi1 = sayi2;
                sayi2 = sayi3;
            }

        }else System.out.println("sayı 47'den büyük ");

    }

}
