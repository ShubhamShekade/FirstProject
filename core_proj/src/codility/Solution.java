package codility;
import java.util.*;
public class Solution {
	public int solution(int N) {
        String value = Integer.toBinaryString(N);
        int counter = 0;
        List<Integer> counters = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            char current = value.charAt(i);
            if (current == '0') {
                counter += 1;
            } else {
                counters.add(counter);
                counter = 0;
            }
        }
        return Collections.max(counters);
    }
	public static void main(String[]args)
	{
		Solution s=new Solution();
		System.out.println(s.solution(9));
	}


}
