package day1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C12_switchCase {

    public static <Switch> void main(String[] args) {
        /*
        pazartesi salı      : Java Dersi
        Perşembe Cuma       : Selenium
        Çarşamba cumartesi : SQL Dersi
        diğer hallerde      : izin günü
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1 gün giriniz");
        String gün = scan.nextLine();

        switch (gün) {
            case "pazaretsi":
            case "salı":
                System.out.println("Java Dersi");
                break;

            case "perşembe":
            case "cuma":
                break;
            case "çarşamba":
            case "cumartesi":
                break;
            default:
                System.out.println("izin günü");


        }
    }
}



