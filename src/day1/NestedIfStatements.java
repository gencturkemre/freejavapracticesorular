package day1;

public class NestedIfStatements {

    public static void main(String[] args) {
        // hayvan Mekanı >< 15 yaş üstü girebilir, Kedi sevenler sağa, Köpek sevenler sola gitsin

        int yaş = 19;
        String sevdigiHayvan = "kedi";

        if (yaş>=15) {
            if (sevdigiHayvan.equalsIgnoreCase("kedi"))  System.out.println("sağa");
            else if (sevdigiHayvan.equals("köpek"))
                System.out.println("sola");
        }else System.out.println("15 yaş altı giremez");



    }
}
