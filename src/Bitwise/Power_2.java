package Bitwise;

public class Power_2 {
    public static void main(String[] args)
    {
        int n=256;
        while(n>0) {
            int t = (n & 1);
            n = n >> 1;
            if (t == 1 && n == 0) {
                System.out.println("it is power of 2");
            }
            if (t == 1 && n != 0) {
                System.out.println("it is not power of 2");
                break;

            }
        }





//        METHOD 2
        if((n&(n-1))==0)
        {
//           eg: here n=1000
//                  n-1=0111
            System.out.println("it is power of 2");
        }
        else {
            System.out.println("it is power of 2");

        }
    }
}
