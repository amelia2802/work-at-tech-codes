import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class
class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0 && a<=100){
			
			int surface_area = 6 * (int)(Math.pow(a,2));
			int vol = (int)Math.pow(a,3);

			System.out.println(surface_area+" "+vol);
		}
		
	}
}