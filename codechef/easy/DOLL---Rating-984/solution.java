import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){
            int K = sc.nextInt();
            int N = sc.nextInt();
            int cnt = 0;
            for(int i=0;i<K;i++){
                int H = sc.nextInt();
                if(H>N){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
	}
}
