package day1;

import java.util.Scanner;

public class C15_StringManipulationsAndMethods {
    public static void main(String[] args) {

        // kullanıcından  isim ve soyismini alan ve sonra bunları birleştirip yazdıran bir method yapınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ismini gir");
        String isim=scan.nextLine();
        System.out.println("lütfen soy ismi gir");
        String soyIsmi=scan.nextLine();
   



    isimBirlestirmeMethodu(isim,soyIsmi);

}
    public static void isimBirlestirmeMethodu (String isim, String soyIsim){

        String tamIsim = isim +" "+ soyIsim;

        System.out.println(tamIsim);

    }
}
