package collectionex;

import java.util.*;
public class DateEx {
	
	public static void main(String[]args) {
		
		String longestword=" ";
		String s="please do, not touch,my pet,aligator";
		
		StringTokenizer st= new StringTokenizer(s,",");
		
		while(st.hasMoreElements())
		{
			//System.out.println(st.nextElement());
			String word=st.nextToken();
			if(word.length()>longestword.length())
			{
				longestword=word;
			}
		}
		System.out.println(longestword);

	}
}