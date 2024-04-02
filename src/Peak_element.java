import java.util.Arrays;

public class Peak_element {
    public static void main(String[] args)
    {
//        int a[] = new int[10];
//        int a[]={0,1,2,3,4,5,6,7,3,2,1};
        int a[]={5,3,2,0};
        System.out.println(peak(a,0,a.length-1));
    }

    private static int peak(int[] a, int s, int e)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(s==e)
            {
                return a[s];
            }
            else if(a[m+1]<a[m])
            {
                e=m;
            }
            else if(a[m]<a[m+1])
            {
                s=m+1;
            }
        }

     return -1;
    }
}
