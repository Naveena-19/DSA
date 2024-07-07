package Recursion_subseque;

public class Remove_char
{
    public static void main(String[] args)
    {
        System.out.println(remove("baccad",""));

    }
    public static String remove(String s,String nstr)

    {
//        System.out.println(s.substring(0));
//        System.out.println(s.substring(0,1));

        if((s.length())==0)
        {
            return nstr;
        }
        String c=s.substring(0,1);
        if(!(c.equals("a")))
        {
            nstr=nstr+c;
        }
        return remove((s.substring(1)),nstr);
    }
}
