package day1;

public class C11_Nestedif {
    public static void main(String[] args) {



        // oy kullanma skalası
        // yaş 18 büyükse oy kullanabilir, küçük kullanamaz
        // yaş 50'den büyükse 2 oy kullanabilsin
        //yaş 18- 50 arası 1 oy kullanabilsin


        int yas = 51;
        if(yas>=18){
            if (yas>50) System.out.println("2 oy kullanabilirsin");
            else System.out.println("1 oy kullanabilirsin");
        } else { System.out.println("oy kullanamaz");
        }
    }
}
