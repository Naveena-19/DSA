package Recursion_Intro;

public class Print_5times
{
    public static void main(String[] args)
    {
        String s="naveena";
        message(s,5);
    }

    private static void message(String s,int i)
    {

        if(i>0)
        {
            System.out.println(s+"_"+i);

            message(s,i-1);
        }

    }
}
