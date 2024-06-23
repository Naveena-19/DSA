package Handling_arrays;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

public class AL
{
    public static void main(String[] args)
    {
        ArrayList<Integer> n = new ArrayList<>();//creating list
      for(int i=0;i<6;i++)//adding elements
      {
          n.add(i);
      }
        System.out.println(n);
        System.out.println(n.get(4));//accesssing elements
        n.set(2,65);//modifying elements
        System.out.println(n);
        //n.remove(n);
        n.remove(3);//remove elements
        System.out.println(n);
        System.out.println(n.contains(1));//checking element exists
        n.clear();//clear list
        System.out.println(n);
        System.out.println(n.size());//size of list


        Collections.sort(n);
        System.out.println(n);


    }
}
