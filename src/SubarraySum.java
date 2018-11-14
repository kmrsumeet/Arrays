
import java.util.*;
import java.lang.*;
import java.io.*;

class SubarraySum {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n,tot;
		    n = sc.nextInt();
		    tot = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int i=0;
		    while(i<n){
		        int s =0;
		        for(int j=0;j<n;j++){
		            if(s == tot)
		            {
		                System.out.print(i + " " +j);
		            }
		            if(s < tot)
		            {
		                s = s + arr[j];
		            }
		            if(s > tot)
		                i++;
		        }
		    }
		    System.out.println();
		}
	}
}
