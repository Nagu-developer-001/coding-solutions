import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		// your code goes here
		int maxN = 0;
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }    
		    maxN= arr[0];
		    for(int i=1;i<n;i++){
		        if(arr[i]>maxN){
		            maxN = arr[i];
		        }
		    }
		}
		System.out.println(maxN);
        
	}
}
