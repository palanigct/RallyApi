package Patterns;

import java.util.Scanner;

public class Wave 
{
	public static Wave wave=new Wave();
	public static Common common=new Common();
	public static void main(String arg[])
	{
		int height=7;
		int width=5;
		int lenth=5;
		
		wave.wave_3(width, height,lenth);
	}
	
	public void wave_1(int width,int height,int lenth)
	{
		/*
		
		    /\      /\      /\      /\      
		   /  \    /  \    /  \    /  \    
		  /    \  /    \  /    \  /    \  
		 /      \/      \/      \/      \
		
		
		*/
		
		for(int i=1;i<=height;i++ )
		{
					
			common.printSpaceE(i, height);
			
			for(int j=0;j<lenth;j++)
			{				
				common.printChar(i, '/','\\');
				common.printSpaceC(i, height);
			}
			
			System.out.println("");
		}
		
		
		/*
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++)
			{
				if(j==0||j==i*2)
				  System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}*/
	}

	public void wave_2(int width,int height,int lenth)
	{
		/*
		
		    0405      1213      2021      2829      
		   03  06    11  14    19  22    27  30    
		  02    07  10    15  18    23  26    31  
		 01      0809      1617      2425      32
		
		*/
		
		
		for(int i=1;i<=height;i++ )
		{
					
			common.printSpaceE(i, height);
			
			for(int j=0;j<lenth;j++)
			{				
				common.printNumWave(i,height,j);
				common.printSpaceC(i, height);
			}
			
			System.out.println("");
		}		
		
	}

	public void wave_3(int width,int height,int lenth)
	{
		/*
		    DE      LM      TU      
		   C  F    K  N    S  V    
		  B    G  J    O  R    W  
		 A      HI      PQ      X
		
		*/
		
		for(int i=1;i<=height;i++ )
		{
				
			common.printSpaceE(i, height);
			
			for(int j=0;j<lenth;j++)
			{				
				common.printCharWave(i,height,j);
				common.printSpaceC(i, height);
			}
			
			System.out.println("");
		}		
		
	}
	
	public void wave_4(int width,int height,int lenth)
	{
		/*
	     0 0     0 0     0 0     0 0     0 0     
	    0   0   0   0   0   0   0   0   0   0   
	    0   0   0   0   0   0   0   0   0   0   
	   0     0 0     0 0     0 0     0 0     0 
		
		*/
		char ch='0';
		int front_space =3;
		int center_space=3;
		int end_space=3;
		
		for(int i=1;i<=height;i++ )
		{						
			if(i==1)           {front_space=4; center_space=1; end_space=5;}
			else if(i==height) {front_space=2; center_space=5; end_space=1;}
			else               {front_space=3; center_space=3; end_space=3;}
			
			common.printSpace(front_space);	
			for(int j=0;j<lenth;j++)
			{				
				common.printChar(ch);
				common.printSpace(center_space);
				common.printChar(ch);
				common.printSpace(end_space);				
			}
			System.out.println("");
		}		
	}


}
