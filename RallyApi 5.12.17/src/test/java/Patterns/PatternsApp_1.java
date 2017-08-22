package Patterns;

public class PatternsApp_1 
{
	public static void main(String arg[])
    {
		PatternsApp_1 pattern=new PatternsApp_1();
	    int width=5;
	    int height=5;
		
	   // pattern.pattern_32(width,height);   System.out.println(" ");
	    pattern.pattern_33(width, height);
		
		
    }
	
	public void pattern_1(int width,int height)
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_2(int width,int height)
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_3(int width,int height)
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_4(int width,int height)
	{
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print((char)(65+i));
			}
			System.out.println("");
		}
	}
	
	public void pattern_5(int width,int height)
	{
		
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}

	public void pattern_6(int width,int height)
	{
		
		for(int i=height;0<i;i--)
		{
			for(int j=width;j>0;j--)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public void pattern_7(int width,int height)
	{
		
		for(int i=height;0<i;i--)
		{
			for(int j=width;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public void pattern_8(int width,int height)
	{
		
		for(int i=height-1;i>=0;i--)
		{
			for(int j=width-1;j>=0;j--)
			{
				System.out.print((char)(65+i));
			}
			System.out.println("");
		}
	}

	public void pattern_9(int width,int height)
	{
		
		for(int i=height-1;i>=0;i--)
		{
			for(int j=width-1;j>=0;j--)
			{
				System.out.print((char)(65+j));
			}
			System.out.println("");
		}
	}

	public void pattern_10(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_11(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_12(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_13(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_14(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_15(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_16(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((height-i)+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_17(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_18(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(height-i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_19(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_20(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public void pattern_21(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(height-j);
			}
			System.out.println("");
		}
	}
	
	public void pattern_22(int width,int height)
	{
		//width is not used
		for(int i=height-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_23(int width,int height)
	{
		//width is not used
		for(int i=height-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(height-j+64));
			}
			System.out.println("");
		}
	}
	
	public void pattern_24(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_25(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_26(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_27(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_28(int width,int height)
	{
		//width is not used
		for(int i=0;i<height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_29(int width,int height)
	{
		//width is not used
		for(int i=height-1;i>=0;i--)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void pattern_30(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
	
	public void pattern_31(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	
	public void pattern_32(int width,int height)
	{
		//width is not used
		for(int i=height-1;i>=0;i--)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(i+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_33(int width,int height)
	{
		//width is not used
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(j+65));
			}
			System.out.println("");
		}
	}
	
}//enf of class
