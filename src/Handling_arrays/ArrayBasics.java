package Handling_arrays;

import java.util.Arrays;

public class ArrayBasics
{
    public static void main(String args[])
    {
         String[] s= new String[7];
         for(int i=0;i<s.length;i++)
         {
             s[i]="s"+i;
         }

        System.out.println(Arrays.toString(s));
        for(String i:s)
        {
            System.out.print(i+" ");
        }

    }
}
