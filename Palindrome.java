import java.util.*;
import java.lang.*;
import java.io.*;


class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,p=0,c=n;
		while(n!=0)
		{
			r=n%10;
			p=(p*10)+r;
			n=n/10;
		}
		if(c==p)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
