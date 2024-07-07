public class Recursion_Strings {
    public static void main(String[] args) {
        String s = "naveenq";
        String n = "navya";
        System.out.println(s);
        n = "navi";
        s = "sanvi";
        System.out.println(n + " " + s);
        System.out.println(s.substring(1));
        char a='r';
        String q=a+s;
        int m=1;
        q=q+m;
        System.out.println(q);
        System.out.println(Reverse("naveena"));

    }


    public static String Reverse(String str)
    {
        String s="";
        int n=str.length()-1;
        for(int i=n;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        return s;

    }
    public static String Reverse_rec(String str)
    {


        return str;

    }

}

