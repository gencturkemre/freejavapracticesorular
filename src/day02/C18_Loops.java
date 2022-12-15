package day02;

import java.util.Scanner;

public class C18_Loops {
    public static void main(String[] args) {

   /*
	 	Kullanıcıdan satır ve sütun sayısını alın.
	 	Bir dikdörtgen oluşturun.
	 	satırlar = 3 ve sütunlar = 5 ==> * * * * *
	 	                                 * * * * *
	 	                                 * * * * *
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen satır sayısı giriniz");
        int satirSayisi = scan.nextInt();
        System.out.println("lütfen sutun sayısı giriniz");
        int sutunSayisi = scan.nextInt();

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
