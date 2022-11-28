package day02;

public class C01_StringManipulationsContains {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String str= "axyzm";
        if (str.contains("xyz")){
            System.out.println("true");
        }else System.out.println("false");
    }
}
