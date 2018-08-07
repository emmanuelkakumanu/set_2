import java.util.*;
import java.lang.*;
import java.io.*;

class Armstrong_series
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		if(n>10 && n<m)
		{
		for(int i=n+1;i<m;i++)
		{
			int temp=i;
			int arm=0;
			while(temp!=0)
			{
				int r=temp%10;
				arm=arm+(r*r*r);
				temp=temp/10;
				
			}
			if(arm==i)
			System.out.print(arm+" ");
		}
		}
		else
		System.out.print("Invalid Inputs");

	}
}
