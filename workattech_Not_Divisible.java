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
		int t=sc.nextInt();
		while(t>0){
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				if(i%3!=0){
					System.out.print(i+" ");
				}
				else{
					continue;
				}
				
			}
			System.out.println();
			t--;
		}
		
	}
}