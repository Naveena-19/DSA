package Bitwise;

public class BinaryToDec
{
    public static void main(String[] args)
    {
        int a=111;
        BTD(a);
        BTD2(a);

    }
    public static void BTD2(int a)
    {
        int number=0;
        int i=0;
        while(a>0)
        {
            int temp=a%10;
            number=(int)(number+Math.pow(2,i));
            i++;
            a=a/10;
        }
        System.out.println(number);
    }
    public static void BTD(int a) //instead of Math.power() use left shift
    {
        int d_n=0;
       for(int i=0;a>0;i++)
       {
           if(a%10==1)
           {
            d_n += (1<<i);
           }

                   a=a/10;
       }
        System.out.println(d_n);
    }

}
