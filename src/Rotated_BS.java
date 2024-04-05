public class Rotated_BS {
    public static void main(String[] args)
    {
//             int a[]={5,6,7,8,1,2,3,4};
//        int a[]={3,4,5,6,7,8,1,2};
//        int a[]={3,4,5,6,7,8,1,2};
//        int a[]={1,2,3,4,5,6,7,8}; //error
//        int a[]={8,7,6,5,4,3,2,1};//error
//        System.out.println(peak1(a,0,a.length-1));
        int a[]={1};
        int t=0;
        int p=peak1(a,0,a.length-1);
        if(t==a[0])
        {
            System.out.println(0);
        }
        else if(t==a[a.length-1])
        {
            System.out.println(a.length-1);
        }
        if(t>=a[0])
        {
            System.out.println(search(a,0,p,t));

        }
        else if(t<a[0])
        {
            System.out.println(search(a,p+1,a.length-1,t));
        }

    }
    public static int search(int a[],int s,int e,int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (a[m] == target) {
                return m;
            } else if (a[m] > target) {

                e = m - 1;
            } else if (a[m] < target) {
                s = m + 1;

            }

        }
        return -1;
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
                s=m+1;
            }
             else if(a[s]>a[m])
             {
                 e=m;
             }
        }

        return -1;
    }
}
