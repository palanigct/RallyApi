package Patterns;

public class Pyramid 
{
	public static void main(String arg[])
    {
		Pyramid pattern=new Pyramid();
	    int width=5;
	    int height=5;
		
	    //pattern.pattern_41(width,height);   System.out.println(" ");
	    pattern.pattern_43(width, height);	   
    }
	
	public void pattern_34(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_35(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
		
	public void pattern_36(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print((i*2)+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_37(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print((char)(i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_38(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print((char)(i*2+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_39(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_40(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=i*2;j>=0;j--)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_41(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_42(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=i*2;j>=0;j--)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_43(int width,int height)
	{
		//width is not used
		
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=i*2;j>=0;j--)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	
}//end of class

