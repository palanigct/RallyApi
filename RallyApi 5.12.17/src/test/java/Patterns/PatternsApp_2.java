package Patterns;

import java.util.Arrays;

public class PatternsApp_2 
{
	public static PatternsApp_2 pattern=new PatternsApp_2();
	public static Common common=new Common();
	
	public static void main(String arg[])
    {		
	    int width=5;
	    int height=5;

	    //System.out.println(common.abs(-10)+" "+common.abs(20));
	    //pattern.pattern_89(width,height);   System.out.println(" ");	    
	    pattern.pattern_101(width, height);	   
    }
	
	public void pattern_81(int width,int height)
	{	
		/*
		
	      *     
	     * *    
	    *   *   
	   *     *  
	  *       * 
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==i)
				   System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_82(int width,int height)
	{	
		/*
	      1     
	     2 2    
	    3   3   
	   4     4  
	  5       5 
	  
	  */
		for(int i=0;i<height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==i)
				   System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_83(int width,int height)
	{	
		/*
	      5     
	     4 4    
	    3   3   
	   2     2  
	  1       1 
		
		*/
		
		for(int i=0;i<height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==i)
				   System.out.print(height-i);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_84(int width,int height)
	{	
		/*
	      A     
	     B B    
	    C   C   
	   D     D  
	  E       E 
	  
	  */
		for(int i=0;i<height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==i)
				   System.out.print((char)(i+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_85(int width,int height)
	{	
		/*
	      E     
	     D D    
	    C   C   
	   B     B  
	  A       A
	  
	  */
		for(int i=0;i<height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==i)
				   System.out.print((char)(height-i+64));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_86(int width,int height)
	{
		/*
		
		 *       * 
		  *     *  
		   *   *   
		    * *    
		     * 
		 */    
		
		for(int i=1;i<=height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				//System.out.print(common.abs(j));
				if(i==height-common.abs(j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
	}

	public void pattern_87(int width,int height)
	{
		/*
		 
		 1       1 
		  2     2  
		   3   3   
		    4 4    
		     5  
		 
		 */
		
		for(int i=1;i<=height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(i==height-common.abs(j))
					System.out.print(height-common.abs(j));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_88(int width,int height)
	{
		/*
		 5       5 
		  4     4  
		   3   3   
		    2 2    
		     1
		*/
		for(int i=1;i<=height;i++)
		{
			for(int j=height;j>=-height;j--)
			{
				if(i==height-common.abs(j))
					System.out.print(common.abs(j)+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_89(int width,int height)
	{
		/*
		 A       A 
		  B     B  
		   C   C   
		    D D    
		     E
		  */   
		     
		for(int i=1;i<=height;i++)
		{			
			for(int j=height;j>=-height;j--)
			{
				if(i==height-common.abs(j))
					System.out.print((char)(height-common.abs(j)+64));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_90(int width,int height)
	{
		/*
		 
		 E       E 
		  D     D  
		   C   C   
		    B B    
		     A     

		 */    
		
		for(int i=1;i<=height;i++)
		{			
			for(int j=height;j>=-height;j--)
			{
				if(i==height-common.abs(j))
					System.out.print((char)(common.abs(j)+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_91(int width,int height)
	{
		/*
		
	     *    
	    * *   
	   *   *  
	  *     * 
	 *       *
	  *     * 
	   *   *  
	    * *   
	     *    
		
		*/
		for(int i=0;i<height;i++)
		{
			int k=height/2;
			
			for(int j=0;j<height;j++)
			{
				//System.out.print(j);
				
				if((i>k)&&(j==((i%5+1))||j==k*2-((i%5+1))))
					System.out.print('*');
				else if((i<=k)&&(j==k+i||j==k-i))
					System.out.print("*");
				else
					System.out.print(" ");
			
			}
			System.out.println("");
		}
		
		/*
		for(int i=height;i>=-height;i--)
		{
			for(int j=height;j>=-height;j--)
			{
				if(common.abs(j)==height-common.abs(i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		*/
	}
	
	public void pattern_92(int width,int height)
	{
		
	/*
	     1    
	    2 2   
	   3   3  
	  4     4 
	 5       5
	  4     4 
	   3   3  
	    2 2   
	     1   
		
		*/
		
		int k=height-1;
		for(int i=k;i>=-k;i--)
		{
			for(int j=k;j>=-k;j--)
			{
				if(common.abs(j)==k-common.abs(i))
					System.out.print(common.abs(j)+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		/*for(int i=0;i<height;i++)
		{
			int k=height/2;
			for(int j=0;j<height;j++)
			{
				if((i<=k)&&(j==k-i||j==k+i))
				  System.out.print(j+1);
				else if((i>k)&&((j==k*2-(i%5+1))||j==(i%5+1)))
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}*/
	}
		
	public void pattern_93(int width,int height)
	{
	/*	
		
	     5    
	    4 4   
	   3   3  
	  2     2 
	 1       1
	  2     2 
	   3   3  
	    4 4   
	     5    
	*/	
		int k=height-1;
		for(int i=k;i>=-k;i--)
		{
			for(int j=k;j>=-k;j--)
			{
				if(common.abs(j)==k-common.abs(i))
					System.out.print(k-common.abs(j)+1);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_94(int width,int height)
	{
	
	 /*	
	     A    
	    B B   
	   C   C  
	  D     D 
	 E       E
	  D     D 
	   C   C  
	    B B   
	     A    
	
	*/
		int k=height-1;
		for(int i=k;i>=-k;i--)
		{
			for(int j=k;j>=-k;j--)
			{
				if(common.abs(j)==k-common.abs(i))
					System.out.print((char)(common.abs(j)+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}		
		
	}
		
	public void pattern_95(int width,int height)
	{
	  /*
	
	     E    
	    D D   
	   C   C  
	  B     B 
	 A       A
	  B     B 
	   C   C  
	    D D   
	     E   
	  */	
		int k=height-1;
		for(int i=k;i>=-k;i--)
		{
			for(int j=k;j>=-k;j--)
			{
				if(common.abs(j)==k-common.abs(i))
					System.out.print(common.abs(i));//System.out.print((char)(k-common.abs(j)+65));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void pattern_96(int width,int height)
	{
		/*
		
		*********
		**** ****
		***   ***
		**     **
		*       *

		*/
		int k=height-1;
		for(int i=0;i<=k;i++)
		{
			for(int j=k;j>=-k;j--)
			{
				if(i<=common.abs(j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		
		//store the pattern in array
		/*
		int k=height;
		char patt[][]=new char[100][100];	
		
		for(int i=0;i<k;i++)
		{
			for(int j=k-1;j>=-(k-1);j--)
			{
				if(i<=common.abs(j))
					{ 
					  //System.out.print(common.abs(j)); 					  
					  if(j>=0)
						  patt[i][k-common.abs(j)]=(char)(common.abs(j)+65);
					  else
					      patt[i][k+common.abs(j)]=(char)(common.abs(j)+65);				  
					}				
			}			
		}
				
		for(int i=0;i<=height;i++)
		{
			for(int j=0;j<=height*2;j++)
			{
				System.out.print(patt[i][j]);
			}
			System.out.println("");				
		}
		*/
	}
	
	public void pattern_97(int width,int height)
	{
	 
	/*
		*       *
		**     **
		***   ***
		**** ****
		*********
		
	*/	
		int k=height-1;
		for(int i=0;i<=k;i++)
		{
			for(int j=k;j>=-k;j--)
			{
				if(i>=k-common.abs(j))
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
	
	public void pattern_98(int width,int height)
	{
		/*
		  
		  
		  	4       4
			43     34
			432   234
			4321 1234
			432101234
			4321 1234
			432   234
			43     34
			4       4
		  		
		  
		  
		 int k=height-1;
		for(int i=k;i>=-k;i--)
		{
			for(int j=k;j>=-k;j--)
			{
				//System.out.print(common.abs(i)+"-"+common.abs(j)+" ");
				if(common.abs(i)<=common.abs(j))
					System.out.print(common.abs(j));
				else
					System.out.print(" ");
			}
			System.out.println("");
		}*/
		
		
		/*
		
		for(int i=0;i<k;i++)
		{
			for(int j=1;j<k*2;j++)
			{
				if((j>=k+i)||(j<=k-i))
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	  */
		
		/*
		 
		*      *
		**    **
		***  ***
		********
		***  ***
		**    **
		*      *
		
		*/
		
		int k=height-1;
			
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k*2;j++)
			{
				if(i>=j||((k*2-1)-i)<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
		for(int i=k-2;i>=0;i--)
		{
			for(int j=0;j<k*2;j++)
			{
				if(i<j&&((k*2-1)-i)>j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
				
  }

	public void pattern_99(int width,int height)
	{
		/*
		
	     *      *
	    ***    ***
	   *****  *****
	  **************
		
		*/
		
		/*int k=height-1;
		for(int i=0;i<k;i++)
		{	
			
			for(int s=0;s<(k-i);s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{		
				System.out.print("*");
			}
			
			for(int s=0;s<(k*2-2)-(i*2);s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{		
				System.out.print("*");
			}
			
			System.out.println("");
		}
		*/	
		
		int k=height-1;
		for(int i=0;i<k;i++)
		{				
			common.printSpaceEdge(i, k);
			
			for(int j=0;j<2;j++)
			{
				common.printStar3(i);			
				common.printSpaceCenter(i, k);
			}
					
			System.out.println("");
		}
	}
	
	public void pattern_100(int width,int height)
	{
		/*
		
	      *         *         
	     * *       * *       
	    * * *     * * *     
	   * * * *   * * * *   
	  * * * * * * * * * * 
		
		
		*/
		
		int k=height;
		for(int i=0;i<k;i++)
		{				
			common.printSpaceEdge(i, k);
			
			for(int j=0;j<2;j++)
			{
				common.printStar2(i);			
				common.printSpaceCenter(i, k);
			}
					
			System.out.println("");
		}
	}
		
	public void pattern_101(int width,int height)
	{
		/*
		
	       *     
	      * *   
	     * * * 
	    *     *     
	   * *   * *   
	  * * * * * *  
		
		*/
		
		int k=height-2;		
	    common.printPyramid_2(k, 1,k);
	    common.printPyramid_2(k, 2,0);
	}
	

	


}//end of class
















