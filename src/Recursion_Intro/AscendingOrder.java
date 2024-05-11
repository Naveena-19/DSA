package Recursion_Intro;

import org.w3c.dom.ls.LSOutput;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        print1to5(1);
        System.out.println("_______________________________________");
        print1to5_(1);


    }

    private static void print1to5(int i)
    {
        System.out.println(i);
        if(i<5)
        {
            print1to5(i+1);
        }
    }

    private static void print1to5_(int i)
    {

        if(i>=5)
        {
          return;
        }
        System.out.println(i);
        print1to5(i+1);
    }
}
