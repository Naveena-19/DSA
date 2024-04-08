package Bitwise;

public class Power_2 {
    public static void main(String[] args)
    {
        int n=256;
        while(n>0)
        {
            int t=(n&1);
            n=n>>1;
            if(t==1&&n==0){
                System.out.println("it is power of 2");
                            }
            if(t==1&&n!=0)
            {
                System.out.println("it is not power of 2");
                break;

            }
        }
    }
}
