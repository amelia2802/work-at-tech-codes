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
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		if(r>0 && r<=1000){
			if(h>0 && h<=1000){
				double v = 3.14 * Math.pow(r,2) * h;
				double price = (40 * v)/1000;
				System.out.println(String.format("%.2f",price));
			}
		}
		
	}
}