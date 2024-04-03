public class Mountain_Array {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */


        public static void main(String[] args)
        {
//        int a[] = new int[10];
//        int a[]={0,1,2,3,4,5,6,7,3,2,1};
//            int a[]={1,2,3,4,5,3,1};
            int a[]={0,1,2,4,2,1};
            System.out.println(findInMountainArray(3,a));

        }
        public static int findInMountainArray(int target, int[] mountainArr)
        {

            int p=peak(mountainArr,0,mountainArr.length);

            int s=0;
            int e=p;
            int l=findl(mountainArr,s,e,target);
            if(l==-1)
            {
                return findr(mountainArr,p,mountainArr.length-1,target);
            }
           return -1;

        }
        public static int findl(int mountainArr[],int s,int e,int target)
        {
            while(s<=e)
            {
                int m=(s+e)/2;
                if(mountainArr[m]==target)
                {
                    return m;
                }
                else if(mountainArr[m]>target)
                {
                    e=m-1;
                }
                else if(mountainArr[m]<target)
                {
                    s=m+1;
                }

            }
            return -1;

        }
    public static int findr(int mountainArr[],int s,int e,int target)
    {
        while(s<=e)
        {
            int m=(s+e)/2;
            if(mountainArr[m]==target)
            {
                return m;
            }
            else if(mountainArr[m]>target)
            {

                s=m+1;
            }
            else if(mountainArr[m]<target)
            {
                e=m-1;
            }

        }
        return -1;

    }
        public static int peak(int[] a, int s, int e)
        {
            while(s<=e)
            {
                int m=s+(e-s)/2;
                if(s==e)
                {
                    return s;
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
