package Recursion_subseque;

import java.util.ArrayList;

public class Permuatation
{
    public static void main(String[] args)
    {

        ArrayList<String> permuList = new ArrayList<>();
        permu("", "abc", permuList);
        System.out.println(permuList);
    }


    private static void permu(String s1, String s2, ArrayList<String> permuList) {
        if (s2.isEmpty()) {
            permuList.add(s1);
            return;
        }
        char ch= s2.charAt(0);
        for(int i=0;i<=s1.length();i++)
        {
            String f=s1.substring(0,i);
            String s=s1.substring(i,s1.length());
            permu(f+ch+s,s2.substring(1),permuList);
        }

 
    }

}
