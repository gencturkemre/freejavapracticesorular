package day1;

import java.util.Scanner;

public class C13_A_if {
    public static void main(String[] args) {
            /*
        kullanıcıdan bir harf alın ve harfe göre
        A >>   "Java çok kolay"
        B >>   "Java Çok Eğlenceli"
        C >>   "Javayı çok seviyorum"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen karşılığını yazılmasını istediğiniz harfi giriniz" +
                "        \nA >>\"Java çok kolay\"\n" +
                "        B >>   \"Java Çok Eğlenceli\"\n" +
                "        C >>   \"Javayı çok seviyorum\"");
        String harf=scan.nextLine();

        if (harf.equalsIgnoreCase("a")||harf.equalsIgnoreCase("A"))
            System.out.println("Java çok kolay\"\n");
        if (harf.equalsIgnoreCase("b")||harf.equalsIgnoreCase("B"))
            System.out.println("Java Çok Eğlenceli\"\n");
        if (harf.equalsIgnoreCase("c")||harf.equalsIgnoreCase("C"))
            System.out.println("Javayı çok seviyorum\"");



    }


}
