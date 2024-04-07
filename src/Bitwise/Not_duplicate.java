package Bitwise;
import java.util.*;

public class Not_duplicate {
    public static void main(String[] args)
    {
        int[] a={1,1,3,3,2,5,5,6,6};
        System.out.println("the number which does not have duplicate is "+nd(a));//error
        System.out.println(1^1^2);

    }

    private static int nd(int[] a) {
        int d=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            d=d^a[i];
        }
        return d;
    }

}
