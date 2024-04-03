public class Rotated_BS {
    public static void main(String[] args)
    {
             int a[]={5,6,7,8,1,2,3,4};
        System.out.println(peak1(a,0,a.length-1));
    }
    private static int peak1(int[] a, int s, int e)
    {
        while(s<=e)
        {
            int m=s+(e-s)/2;

             if(a[m+1]<a[m])
            {
                return m;
            }
            else if(a[s]<a[m])
            {
                s=m;
            }
             else if(a[s]>a[m])
             {
                 e=m;
             }
        }

        return -1;
    }
}
