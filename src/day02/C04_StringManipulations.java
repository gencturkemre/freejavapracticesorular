package day02;

public class C04_StringManipulations {
    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


        String cümle="   Java ogrenmek123 Cok guzel@      ";

        String yeniCümle=cümle.trim().replaceAll("\\d", "").replace("@","");
        System.out.println(yeniCümle);
        System.out.println(yeniCümle.substring(0,1).toUpperCase()+yeniCümle.substring(1).toLowerCase());
    }
}
