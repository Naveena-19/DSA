package Recursion_Intro;

public class DescendingOrder
{
    public static void main(String[] args)
    {
        print5to1(1);
        System.out.println("_________________________________________");
        print5to1_(5);

    }

    private static void print5to1(int i)
    {
        if(i>5)
        {
            return;
        }
        print5to1(i+1);
        System.out.println(i);

    }

    private static void print5to1_(int i)
    {
        if(i<1)
        {
            return;
        }
        System.out.println(i);
        print5to1_(i-1);

    }
}
