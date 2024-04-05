package Bitwise;

public class Setbit {
    public static void main(String[] args)
    {
        int a=8;
        int i=0;
        while(a>0)
        {
            int t= a&1;
            if(t==1)
            {
                System.out.println(i);
                break;
            }
            i++;

                a=  a>>1;
        }

    }
}
