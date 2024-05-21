package Recursion_Intro;

public class fibo
{
    public static void main(String[] args)
    {
        System.out.println(fibonacci(5));
        System.out.println("____________________________");
        fibonacci_(0,34);



    }

    private static void fibonacci_(int i,int j)
    {

        j=fibonacci(i);
        System.out.println(j);
       fibonacci_(i+1,fibonacci(j));
        if(j>35)
        {
            return;
        }

    }

    private static int fibonacci(int i)
    {
        if(i==1)
        {
            return 1;
        }
        if(i==0)
        {
            return 0;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }
}
