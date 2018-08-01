import java.util.*;
import java.lang.*;
import java.io.*;

class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=s.nextInt();
		int pow=0;
		for(int i=0;i<p;i++)
		pow=n*n;
		System.out.println(pow);
	}
}
