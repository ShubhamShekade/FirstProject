package codility;
import java.util.*;

class Solution {

    public int solution(int[] A) {

         int found = 0;

         int i = 0;

         int j = 1;

         Arrays.sort(A);

         if (A.length == 1) 

         {

              found = A[0];

         }

         while (A.length % 2 == 1 && i < A.length && j < A.length) 

         {

               if (A[i] == A[i+1]) 

               {

                   i = i + 2;

                   j = j + 2;  

               } 

               else 

               {

                  found = A[i];

                  break;

               }

         }

         if (found == 0 && i == A.length-1) 

         {

             found = A[i];

         }

         return found;

    }

}