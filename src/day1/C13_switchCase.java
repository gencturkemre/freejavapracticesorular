package day1;


import java.util.Scanner;

public class C13_switchCase {
    public static void main(String[] args) {
         /*
           kullanıcıdan bir harf alın ve harfe göre
           A >>   "Java çok kolay"
           B >>   "Java Çok Eğlenceli"
           C >>   "Javayı çok seviyorum"
            */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karşılığını yazılmasını istediğiniz harfi giriniz" +
                "        \nA >>   \"Java çok kolay\"\n" +
                "        B >>   \"Java Çok Eğlenceli\"\n" +
                "        C >>   \"Javayı çok seviyorum\"");
        String harf = scan.nextLine();
        switch (harf) {
            case "a":
            case "A":
                System.out.println("\nA >>\"Java çok kolay\"\n");
                break;
            case "b":
            case "B":
                System.out.println("\"B >>   \\\"Java Çok Eğlenceli\\\"\\n\"");
                break;
            case "c":
            case "C":
                System.out.println("        C >>   \"Javayı çok seviyorum\"");
                break;
            default:
                System.out.println("lütfen A,a,B,b,C,c harflerinden birini giriniz");


        }
    }

}
