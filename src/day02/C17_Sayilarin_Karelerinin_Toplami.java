package day02;

import java.util.Scanner;

public class C17_Sayilarin_Karelerinin_Toplami {
    public static void main(String[] args) {
         /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1 den büyük 1 sayı giriniz.");
        int sayi = scan.nextInt();

        int toplam = 0;
        for (int i = 0; i < sayi; i++) {

            int kareler=i*i;
            toplam=toplam+kareler;
        }
        System.out.println(toplam);

    }
}
