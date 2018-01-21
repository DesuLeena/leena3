import java.util.*;
import java.io.*;
import java.lang.*;
import java.*;
class abc
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		int b[]=new int[3];
		char al[]=new char[3];
		int s,l,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		s=a[0];
		l=a[0];
		m=a[0];
		System.out.println("enter alphabets");
		for(int i=0;i<3;i++)
		{
			al[i]=sc.next().charAt(0);
		}
		for(int j=1;j<3;j++)
				{	
					
					if(s>a[j])
					{
						s=a[j];
						
					}
				}
		for(int j=1;j<3;j++)
				{	
					
					if(l<a[j])
					{
						l=a[j];
					}
				}
		for(int i=0;i<3;i++)
		{
			if((s<a[i])&&(a[i]<l))
			{
				m=a[i];
			}
		}
		for(int i=0;i<3;i++)
		{
			if(al[i]=='a')
			{
				
			a[i]=s;
			}
			else if(al[i]=='c')
			{
				
			a[i]=l;
			}
			else
			{
				a[i]=m;
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
	}
}
				