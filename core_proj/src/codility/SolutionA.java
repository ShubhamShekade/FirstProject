package codility;

import java.util.*;
class SolutionA {
    public int solution(String S) {
      
        int c;
        if(S.isEmpty())
        {
            c=0;
        }
        else
        c=1;
       Set h=new HashSet();
        for(int i=0;i<S.length();i++)
        {
           if(h.contains(S.charAt(i)))
           {
               h.clear();
               c++;
           }
           h.add(S.charAt(i));
        }
return c;
    }
}