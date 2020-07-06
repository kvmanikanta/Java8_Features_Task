import java.util.*;
import java.util.stream.IntStream;

public class ReturningPalindromeStrings {
	
	static void MethodcheckPalindrome(String c) {
		
		String temp  = c.replaceAll("\\s+", "").toLowerCase(); //Converting to Lowercase
	    boolean value =  IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	     
	    	 if(value)
	    	  {
	    		  System.out.println(c);
	    	  }
	    
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();

		int n;
		System.out.println("Enter no of Strings : ");
		n = in.nextInt();
		String str;
		for(int i = 0; i<n; i++)
		{    int t=i+1;
    	System.out.println("Enter "+t+ " Positon Element: ");
			str=in.next();
			
			list.add(str);
		}
		Iterator<String> itobj = list.iterator();
		//iterating on string array  
		System.out.println("The Palindrome Strings are: ");
	      while(itobj.hasNext()) {
	    	  MethodcheckPalindrome(itobj.next());
	    	 
	        
	      }
	      in.close();
		
		
		
	}
}
