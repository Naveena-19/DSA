public class BS_Infinte
{
public static void main(String[] args)
{
    //int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
    int[] a = new int[100];

    // Initializing the array with values from 1 to 100
    for (int i = 0; i < 100; i++)
    {
        a[i] = i + 1;
    }

    System.out.println(BSI(a,0,1,34));
}

    private static int BSI(int[] a,int s,int e,int t)
    {
        while(s<=e)
        {
            int m = s + (e - s) / 2;


            if(a[s] == t )
            {
                return s;
            }

            else if(a[e] == t)
            {
                return e;
            }
            if (a[m] == t ) {
                return m;
            }
            else if (a[m] > t) {
                e = m - 1;
            } else if (a[m] < t) {
                s = m + 1;
            }
        }
        return BSI(a,e,e*2,t);
    }

}
