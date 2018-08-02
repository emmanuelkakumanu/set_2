import java.util.*;
import java.lang.*;
import java.io.*;

class Sort_Array1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int b[]=new int[size];
		for(int i=0;i<size;i++)
		b[i]=s.nextInt();
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
				
			}
		}
		for(int i=0;i<size;i++)
    		{
			if(i<size-1)
    			System.out.print(b[i]+" ");
    			else
    			System.out.print(b[i]);
    		}
		
	}
}
