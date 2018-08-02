import java.util.*;
import java.lang.*;
import java.io.*;

class Numeric_Check
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int f=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetter(c))
			f=1;
		}
		if(f==1)
		System.out.println("No");
		else
		System.out.println("yes");
	}
}
