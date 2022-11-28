package day1;

public class C17_StringManipulations {
    public static void main(String[] args) {

 /*
        Aşağıdaki değerleri toplayabilen bir program yapınız
        12.34$
        32.23$
            /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
		 	 */
        String değer1 = "12,34$";
        String değer2 = "32,23$";

        String yenideğer1=değer1.replaceAll("\\D","");
        System.out.println(yenideğer1);
        String yenideğer2=değer2.replaceAll("\\D","");
        System.out.println(yenideğer2);

        double sayi1=Double.parseDouble(yenideğer1)/100;
        System.out.println(sayi1);
        double sayi2=Double.parseDouble(yenideğer2)/100;
        System.out.println(sayi2);

        System.out.println("Toplam değer = " + (sayi1+sayi2));







    }
}
