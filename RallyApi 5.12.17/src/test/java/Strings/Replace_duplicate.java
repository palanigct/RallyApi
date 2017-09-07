package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Replace_duplicate 
{

	public static  int[] exist_char =new int[500];
	public static Replace_duplicate replace_duplicate = new Replace_duplicate();
	
	public static void main(String arg[])
	{
		
		String str="cfgzz8999";
		//replace_duplicate.replace(str);
	
		
		Arrays.fill(exist_char, 0);
		
		System.out.println("Enter the input string : ");
		Scanner get=new Scanner(System.in);
		str=get.next();		
		replace_duplicate.replace(str);
		
	}
	
	public void replace(String str)
	{		
		String final_string="";			
		char ans=str.charAt(0);		
		int count=0;
		
		final_string +=ans;
		exist_char[(int)ans]++;	
		
		
		for(int i=1;i<str.length();i++)
		{
			ans=str.charAt(i);
			count=0;
			boolean flag=true;
			
			while(flag==true&&count<27)
			{				
				count++;
				if(exist_char[(int)ans]==0) 
				{ 
					 flag=false;
				}
				else 
				{
					if(ans=='z')
						ans='a';
					else if(ans=='Z')
						ans='A';
					else if(ans=='9')
						ans='0';
					else
					   ans++; 				
				}							
			}//end-while
			
			final_string +=ans;
			exist_char[(int)ans]++;
			
		}// end-for
		
		System.out.println("Out put : old - "+str+ " New - "+final_string);
	}
	
	public char resultChar(char ch)
	{
		char ans=' ';		
		if(exist_char[(int)ch]!=0) ans=ch++;
		else ans=ch;		
		return ans;
	}
	
	
}


