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
		double arr[] = new double[10];//initialize with student number
		double sum=0.0;	//initialize a sum 
		
		for(int i=0;i<arr.length;i++){	//put array elements
			arr[i] = sc.nextDouble();
		}
		
		for(int i=0;i<arr.length;i++){	//summation of elements
			sum+=arr[i];
		}
		
		double avg = sum/10;	//average
		System.out.println((String.format("%.6f",avg)));	//display
		
		
	}
}