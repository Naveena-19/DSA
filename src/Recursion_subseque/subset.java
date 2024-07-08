package Recursion_subseque;

        import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        ArrayList<String> subsetsList = new ArrayList<>();
        subsets("", "abc", subsetsList);
        System.out.println(subsetsList);
        // The ArrayList 'subsetsList' now contains all subsets
    }

    private static void subsets(String s1, String s2, ArrayList<String> subsetsList) {
        if (s2.isEmpty()) {
            subsetsList.add(s1);
            return;
        }
        subsets(s1 + s2.charAt(0), s2.substring(1), subsetsList);
        subsets(s1, s2.substring(1), subsetsList);
    }

/*

    private static int subsets(String s1, String s2,String[] a,int i)
    {
        if(s2.isEmpty())
        {
//            System.out.println(s1);

            a[i]=s1;
            return i+1;
        }
        i=subsets(s1+s2.charAt(0),s2.substring(1),a,i);
        i=subsets(s1,s2.substring(1),a,i);
        return i;

    }

*/
}