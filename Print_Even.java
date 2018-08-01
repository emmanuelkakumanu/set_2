import java.util.*;
import java.lang.*;
import java.io.*;


class Print_Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n+1;i<m;i++)
		{
			if(i%2==0)
			System.out.print(i);
			else if(i==m-1)
			break;
			else
			System.out.print(" ");
		}
	}
}
