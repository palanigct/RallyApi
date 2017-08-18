package Patterns;

public class Pyramid_2 
{

	public static Pyramid_2 pattern=new Pyramid_2();
	public static Common common=new Common();
	
	public static void main(String arg[])
    {		
	    int width=5;
	    int height=9;

	    //System.out.println(common.abs(-10)+" "+common.abs(20));
	    pattern.pattern_79(width,height);   System.out.println(" ");	    
	    pattern.pattern_80(width, height);	   
    }
	
	public void pattern_64(int width,int height)
	{
		/*
		
 	       * 
	      * * 
	     * * * 
	    * * * * 
	   * * * * * 

        */
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void pattern_65(int width,int height)
	{
		/*
	        1 
	       2 2 
	      3 3 3 
	     4 4 4 4 
	    5 5 5 5 5 
	  
	    */
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_66(int width,int height)
	{
		/*	
	        1 
	       1 2 
	      1 2 3 
	     1 2 3 4 
	    1 2 3 4 5 

		*/
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_67(int width,int height)
	{
		/*
		
	        A  
	       B B 
	      C C C 
	     D D D D 
	    E E E E E 
		
		*/
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65)+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_68(int width,int height)
	{
		/*
		 
	      	A 
	       A B 
	      A B C 
	     A B C D 
	    A B C D E 
	    
		*/
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+65)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_69(int width,int height)
	{
		/*
		
		 * * * * * * 
		  * * * * * 
		   * * * * 
		    * * * 
		     * * 
		      * 
		*/
		
		for(int i=height;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void pattern_70(int width,int height)
	{
		/*

		 5 5 5 5 5 
		  4 4 4 4 
		   3 3 3 
		    2 2 
		     1
		*/
		for(int i=height;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_71(int width,int height)
	{
		/*

		 5 4 3 2 1 
		  4 3 2 1 
		   3 2 1 
		    2 1 
		     1
		*/
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i-j+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_72(int width,int height)
	{
		/*
		
		  E E E E E 
		   D D D D 
		    C C C 
		     B B 
		      A
		*/
		for(int i=height-1;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_73(int width,int height)
	{
		/*
		  E D C B A 
		   D C B A 
		    C B A 
		     B A 
		      A 
		*/
		
		for(int i=height-1;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i-j+65)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_74(int width,int height)
	{

		for(int i=height-1;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+65)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_75(int width,int height)
	{
		/*
		
	      * 
	     * * 
	    * * * 
	   * * * * 
	  * * * * * 
	   * * * * 
	    * * * 
	     * * 
	      * 
	      
		*/
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void pattern_76(int width,int height)
	{
		/*		
	      1 
	     2 2 
	    3 3 3 
	   4 4 4 4 
	  5 5 5 5 5 
	   4 4 4 4 
	    3 3 3 
	     2 2 
	      1 
		*/
		
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				System.out.print(k+1-common.abs(i)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_77(int width,int height)
	{
		/*
	      1 
	     1 2 
	    1 2 3 
	   1 2 3 4 
	  1 2 3 4 5 
	   2 3 4 5 
	    3 4 5 
	     4 5 
	      5 
		
		*/
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				if(i>=0)
					System.out.print(j+1+" ");
				else
					System.out.print(j+common.abs(i)+1+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_78(int width,int height)
	{
		/*
	      1 
	     1 2 
	    1 2 3 
	   1 2 3 4 
	  1 2 3 4 5 
	   1 2 3 4 
	    1 2 3 
	     1 2 
	      1 
		*/
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println("");
		}
	}
	
	public void pattern_79(int width,int height)
	{
		/*
	      A 
	     B B 
	    C C C 
	   D D D D 
	  E E E E E 
	   D D D D 
	    C C C 
	     B B 
	      A
	       
	       */
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				System.out.print((char)(k-common.abs(i)+65)+" ");
			}
			System.out.println("");
		}
	}

	public void pattern_80(int width,int height)
	{
		/*
	      A 
	     A B 
	    A B C 
	   A B C D 
	  A B C D E 
	   B C D E 
	    C D E 
	     D E 
	      E
	      
	       */
		int k=height/2;
		for(int i=k;i>=-k;i--)
		{
			for(int s=0;s<=common.abs(i);s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=k-common.abs(i);j++)
			{
				if(i>=0)
					System.out.print((char)(j+65)+" ");
				else
					System.out.print((char)(j+common.abs(i)+65)+" ");
			}
			System.out.println("");
		}
	}

		
	
}

