package Patterns;

public class Designs 
{
	public static Designs pattern=new Designs();
	public static Common common=new Common();
	
	public static void main(String arg[])
    {		
	    int width=5;
	    int height=5;

	    //System.out.println(common.abs(-10)+" "+common.abs(20));
	    pattern.pattern_84(width,height);   System.out.println(" ");	    
	    pattern.pattern_85(width, height);	   
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



}
