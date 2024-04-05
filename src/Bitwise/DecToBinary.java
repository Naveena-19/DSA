package Bitwise;

import java.util.Arrays;

public class DecToBinary {
    public static void main(String[] args) {
        int a=8;
        //using array
        int[] arr= new int[4];
       DecTB(a,arr);//using array
        DtB(a);//using power

        DTBi(a);//using bitwise




    }

    private static void DTBi(int a)
    {
        for(int i=31;i>=0;i--)//assuming becz int has 32 bits
        {
            int k=a>>i;
            if((k&1)>0)
            {
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
    }

    private static void  DecTB(int a, int[] arr)
    {
        for(int i=arr.length-1;a>0;i--)
        {
            arr[i]=a%2;
            a=a/2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void DtB(int a)//using power
    {
        int binary=0;
        for(int i=0;a>0;i++)
        {
            binary= (int) (binary+((a%2)*Math.pow(10,i)));
            a=a/2;
        }
        System.out.println(binary);
    }
}
