package Patterns;

import com.app.RallyApi.Common_Functions;

public class PatternsApp_3 
{
	public static Common common=new Common();
	
	public static void main(String arg[])
    {
		PatternsApp_3 pattern=new PatternsApp_3();
	    int width=5;
	    int height=7;
		
	    //pattern.pattern_125(width,height);   System.out.println(" ");
	    pattern.pattern_130(width, height);
				
    }
	
	
	public void pattern_102(int width,int height)
	{
		/*
		
		*   *
		 * * 
		  *  
		 * * 
		*   *
		
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_103(int width,int height)
	{
		/*
		
		1   1
		 2 2 
		  3  
		 4 4 
		5   5
		 
		*/ 
		 
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_104(int width,int height)
	{
		/*
		
		5   5
		 4 4 
		  3  
		 2 2 
		1   1
		 
		 */
		 
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print(height-i);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_105(int width,int height)
	{
		/*
		
		1   5
		 2 4 
		  3  
		 2 4 
		1   5
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }

	public void pattern_106(int width,int height)
	{
		/*
		
		5   1
		 4 2 
		  3  
		 4 2 
		5   1

		*/
		 
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print(height-j);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }

	public void pattern_107(int width,int height)
	{
		
		/*
		A   A
		 B B 
		  C  
		 D D 
		E   E
		 
		 */
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print((char)(i+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }

	public void pattern_108(int width,int height)
	{
		/*
		
		A   E
		 B D 
		  C  
		 B D 
		A   E
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print((char)(j+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }

	public void pattern_109(int width,int height)
	{
		/*
		
		oxxxx
		xoxxx
		xxoxx
		xxxox
		xxxxo
		
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println("");
		}
	 }

	public void pattern_110(int width,int height)
	{
		/*
		 
		ooooo
		xoooo
		xxooo
		xxxoo
		xxxxo
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i<=j)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println("");
		}
	 }

	public void pattern_111(int width,int height)
	{
		 
		/*
		 
		xooox
		oxoxo
		ooxoo
		oxoxo
		xooox
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==j||j==(height-1)-i)
					System.out.print("x");
				else
					System.out.print("o");
			}
			System.out.println("");
		}
	 }

	public void pattern_112(int width,int height)
	{
		/*
		
		xxxxx
		xxxxx
		xxoxx
		xxxxx
		xxxxx

		*/
		
		int k=height/2;
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==k&&j==k)
					System.out.print("o");
				else
					System.out.print("x");
			}
			System.out.println("");
		}
	 }

	public void pattern_113(int width,int height)
	{
		/*
		
		  *  
		  *  
		*****
		  *  
		  *  
		  
		  */
		int k=height/2;
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==k||j==k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }

	public void pattern_114(int width,int height)
	{
		/*
		
		ooxoo
		ooxoo
		xxxxx
		ooxoo
		ooxoo	

		*/
		
		int k=height/2;
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==k||j==k)
					System.out.print("x");
				else
					System.out.print("o");
			}
			System.out.println("");
		}
	 }

	public void pattern_115(int width,int height)
	{
		/*
		 
	      ****
	     ****
	    ****
	   ****
	  ****
		
		*/
		
		int k=height/2;
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<height-1;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }

	public void pattern_116(int width,int height)
	{
		/*
		
		**
		**
		****
		****
		******
		******

		*/
		
		for(int i=0;i<height;i++)
		{
			int nos=2+(i/2)*2;
			for(int j=0;j<nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }

	public void pattern_117(int width,int height)
	{
		/*
		
	    **
	    **
	  ****
	  ****
	******
	******
		
		*/
		
		for(int i=0;i<height;i++)
		{
			int nos=2+(i/2)*2;
			for(int s=0;s<height-nos;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }

	public void pattern_118(int width,int height)
	{
     /*
		
		******
		******
		****
		****
		**
		**
		
		*/
		
		for(int i=height-1;i>=0;i--)
		{
			int nos=2+(i/2)*2;			
			
			for(int j=0;j<nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }

	public void pattern_119(int width,int height)
	{	
		/*
		
		******
		******
		  ****
		  ****
		    **
		    **
			
		*/	
		
		for(int i=height-1;i>=0;i--)
		{
			int nos=2+(i/2)*2;
			for(int s=0;s<height-nos;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }
	
	public void pattern_120(int width,int height)
	{	
		/*		
		
		*
		*
		**
		**
		***
		***
		
		*/
		
		for(int i=0;i<height;i++)
		{
			int nos=(i/2);			
			
			for(int j=0;j<=nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }
	
	public void pattern_121(int width,int height)
	{	
		/*
		
		   *
		   *
		  **
		  **
		 ***
		 ***
		
		*/
		
		for(int i=0;i<height;i++)
		{
			int nos=(i/2);			
			
			for(int s=0;s<height/2-nos;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=nos;j++)
			{				
				System.out.print("*");				
			}
			
			System.out.println("");
		}
	 }
	
	public void pattern_122(int width,int height)
	{			
		/*
		
		***
		***
		**
		**
		*
		*
		
		*/
		
		for(int i=height-1;i>=0;i--)
		{
			int nos=(i/2);
			
			
			for(int j=0;j<=nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }
	
	public void pattern_123(int width,int height)
	{			
		/*
		
		***
		***
		 **
		 **
		  *
		  *
		  
		  */
		
		for(int i=height-1;i>=0;i--)
		{
			int nos=(i/2);
			
			for(int s=1;s<height/2-nos;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }
	
	public void pattern_124(int width,int height)
	{
		
		/*
		
		  *
		  *
		 ***
		 ***
		*****
		*****
		
		*/
		
		for(int i=0;i<height;i++)
		{
			int nos=(i/2)*2;
			
			for(int s=0;s<((height-1)/2)-((i/2));s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=nos;j++)
			{				
				System.out.print("*");				
			}
			System.out.println("");
		}
	 }
	
	public void pattern_125(int width,int height)
	{
		/*
		
		******
		*    *
		*    *
		*    *
		*    *
		******
		
		*/	
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==0||j==0||i==height-1||j==height-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }
	
	public void pattern_126(int width,int height)
	{
		
		/*
		
		******
		*####*
		*####*
		*####*
		*####*
		******
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==0||j==0||i==height-1||j==height-1)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println("");
		}
	 }
	
	public void pattern_127(int width,int height)
	{
		/*
		
		*     
		**    
		* *   
		*  *  
		*   * 
		******
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==height-1||j==0||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	 }
	
	public void pattern_128(int width,int height)
	{
		
		/*
		
		*******
		**   **
		* * * *
		*  *  *
		* * * *
		**   **
		*******
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i==0||j==0||i==height-1||j==height-1||i==j||j==height-1-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_129(int width,int height)
	{
		/*
	     .    
	    ...   
	   . . .  
	  .  .  . 
	 .........
	  .  .  . 
	   . . .  
	    ...   
	     . 
	     
	     */
		
		
		
		int k=height/2;		
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i<=k&&(j==k-i||j==k+i))
					System.out.print(".");
				else if(i>k&&(j==i-k||j==(height-1)-(i-k)))					
					System.out.print(".");
				else if(j==k||i==k)
					System.out.print(".");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_130(int width,int height)
	{
		
		/*
		   .   
		    .  
		     . 
		.......
		     . 
		    .  
		   .   

		*/
		
		int k=height/2;			
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(i<=k&&(j==k+i))
					System.out.print(".");
				else if(i>k&&(j==(height-1)-(i-k)))					
					System.out.print(".");
				else if(i==k)
					System.out.print(".");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
