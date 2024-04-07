package Bitwise;

public class Noof_digits {
    public static void main(String[] args)
    {
        int n=1234;
        //no. of digits of a number n in base b can be defined as
//        (log(n)/log(b))+1
        int b=10;//decimal
        System.out.println((int)(Math.log(n)/Math.log(b))+1);




        int n1=11;

        int b1=2;//binary
        System.out.println((int)(Math.log(n1)/Math.log(b1))+1);

    }
}
