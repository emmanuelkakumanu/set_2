import java.util.*;
import java.lang.*;
import java.io.*;

class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,arm=0,on=n;
		while(n!=0)
		{
			r=n%10;
			arm=arm+(r*r*r);
			n=n/10;
		}
		if(arm==on)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
