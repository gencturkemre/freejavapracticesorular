package day02;

public class C10_Methods {
     /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
     // int cmSayi =10000000;


    public static void main(String[] args) {

        int cmSayi =2000000;
        dönüşenSayi(cmSayi);

}

    public static void dönüşenSayi(int cmSayi) {



        int metresayi=cmSayi/100;


        int kilometreSayi=cmSayi/100000;

        String dönüşenSayi=cmSayi + " " + "santimetre "+ metresayi + " " +"metre "+ kilometreSayi+ " " +"kilometre ";


        System.out.println("dönüşenSayi = " + dönüşenSayi);
    }
}
