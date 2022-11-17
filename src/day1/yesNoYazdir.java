package day1;

import java.util.Scanner;

public class yesNoYazdir {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yes için y ye no için n ye basınız");
        String karater = scan.nextLine();

        if (karater.equalsIgnoreCase("y")) System.out.println("yes");
        else {
            System.out.println("no");


        }


    } }