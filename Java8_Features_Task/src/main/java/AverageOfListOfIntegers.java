import java.util.*;
public class AverageOfListOfIntegers {
	public static void main(String[] args) {
		System.out.println("Enter no of elements: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> l = new ArrayList<Integer>(); 
		int i,element;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+i+ " Positon Element: ");
			element = in.nextInt();
			l.add(element);
		}
		OptionalDouble result = l.stream().mapToInt(x->x).average();//converting list of integer to stream
		System.out.println("Average of list of Intergers Provided is: "+result); //Printing Average
		in.close(); //Scanner object closing
		
	}
}