import java.util.*;
import java.lang.*;
import java.io.*;

class Prime_series
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int pr[]=new int[100];
		for(int i=n+1;i<m;i++)
		{
		int cnt=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			cnt++;
		}
		if(cnt==2)
		System.out.print(i+" ");
			
		}

	}
}
