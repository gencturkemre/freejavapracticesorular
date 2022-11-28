package day02;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

         /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();

        if (!(kelime.length()/2==0) && kelime.length()>=3){
            System.out.println(kelime.charAt((kelime.length()-1)/2));
        }
    }
}
