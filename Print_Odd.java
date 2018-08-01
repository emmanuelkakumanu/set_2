import java.util.*;
import java.lang.*;
import java.io.*;


class Print_Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<=m;i++)
		{
			if(i%2==1)
			System.out.print(i);
			else
			System.out.print(" ");
		}
	}
}
