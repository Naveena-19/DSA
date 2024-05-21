package Patterns;

public class InvertedtriangleNumbers
{
    public static  void main(String[] args)
    {
       /* pattern required print is
            given number 5 as input
            output need to be
            15 14 13 12 11
            10       7
            6     4
            3 2
            1
            */

        ITN(5);

    }

    private static void ITN(int n)
    {
        int[][] a = new int[5][5];
        int c = 0;
        for (int i = 1; i <= 15; i++)
        {
            c++;
        }
        //System.out.println(c);


        for (int i = 0; i < 1; i++)
        {
         for(int j=a.length-1;j>=0;j--)
         {
             a[i][j]=c;
             c--;
            System.out.print(a[i][j]+ " ");

         }
            System.out.println();

        }

        for (int i = 1; i <=a.length-1; i++)
        {
            for(int j=a.length-1;j>=0;j--)
            {
                if(j==a.length-1||i==j)
                {
                    a[i][j]=c;
                }

                c--;
                System.out.print(a[i][j]+ " ");
                if(i==j)
                {
                    break;
                }


            }
            System.out.println();

        }


    }
}
