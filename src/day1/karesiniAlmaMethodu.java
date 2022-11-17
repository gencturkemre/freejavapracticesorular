package day1;

import java.util.Scanner;

public class karesiniAlmaMethodu {

        public static void main(String[] args) {

            kareAlma();

        }

        public static void kareAlma() {

            Scanner scan = new Scanner(System.in);
            System.out.println("sayi gir");
            int sayi = scan.nextInt();
            int kareAlma = sayi * sayi;
            System.out.println(kareAlma);

        }

    }

