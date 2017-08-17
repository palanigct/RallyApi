package Patterns;

public class Pyramid 
{
	public static Pyramid pattern=new Pyramid();
	public static Common common=new Common();
	
	public static void main(String arg[])
    {		
	    int width=5;
	    int height=7;

	    //System.out.println(common.abs(-10)+" "+common.abs(20));
	    pattern.pattern_55(width,height);   System.out.println(" ");	    
	    pattern.pattern_56(width, height);	   
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
			
			for(int j=0;j<=i*2;j++)
			{
				System.out.print(common.abs(i-j));
			}
			System.out.println("");
		}
	}
	
	public void pattern_44(int width,int height)
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
				System.out.print((char)(common.abs(i-j)+65));
			}
			System.out.println("");
		}
	}
	
	public void pattern_45(int width,int height)
	{
		//width is not used
		int k=1;
		for(int i=1;i<=height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
	
			for(int j=1;j<i*2;j++)
			{
				int ans=i-common.abs(i-j);
				System.out.print(ans);
			}
			System.out.println("");
		}
	}
	
	public void pattern_46(int width,int height)
	{
		//width is not used
		int k=1;
		for(int i=1;i<=height;i++)
		{
			for(int s=0;s<height-i;s++)
			{
				System.out.print(" ");
			}
	
			for(int j=1;j<i*2;j++)
			{
				int ans=i-common.abs(i-j);
				System.out.print((char)(ans+64));
			}
			System.out.println("");
		}
	}

	public void pattern_47(int width,int height)
	{
		
		for(int i=height;i>=0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public void pattern_48(int width,int height)
	{
		/*
		  555555555 
  		   4444444 
   			33333 
    		 222 
     		  1 
		 */
		
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	
	public void pattern_49(int width,int height)
	{
		/*
		 999999999 
		  7777777 
		   55555 
		    333 
		     1 
        */    
		
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print(i*2-1);
			}
			System.out.println(" ");			
		}
	}
	
	public void pattern_50(int width,int height)
	{
		/*
		 123456789 
		  1234567 
		   12345 
		    123 
		     1 
		*/
		
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	public void pattern_51(int width,int height)
	{
		/*
		 EEEEEEEEE 
		  DDDDDDD 
		   CCCCC 
		    BBB 
		     A 
		     */
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println(" ");
		}
	}

	public void pattern_52(int width,int height)
	{
		/*
		 IIIIIIIII 
		  GGGGGGG 
		   EEEEE 
		    CCC 
		     A 
		*/
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print((char)(i*2+63));
			}
			System.out.println(" ");
		}
	}
	
	public void pattern_53(int width,int height)
	{
		/*
		 ABCDEFGHI 
		  ABCDEFG 
		   ABCDE 
		    ABC 
		     A 
         */  
		for(int i=height;i>0;i--)
		{
			for(int s=0;s<=height-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println(" ");
		}
	}

	public void pattern_54(int width,int height)
	{
	 /*
		* 
		** 
		*** 
		**** 
		*** 
		** 
		*
	  */ 	
		int k=height/2;  
		for(int i=k;i>=-(k);i--)
		{
			for(int j=0;j<=(k-common.abs(i));j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			//System.out.println((k)-(common.abs(i)));
		}
	}

	public void pattern_55(int width,int height)
	{
	  /*
		3 
		32 
		321 
		3210 
		321 
		32 
		3
	  */	 
		int k=height/2;  
		for(int i=k;i>=-(k);i--)
		{
			for(int j=0;j<=(k-common.abs(i));j++)
			{
				System.out.print(k-j);
			}
			System.out.println(" ");
			//System.out.println((k)-(common.abs(i)));
		}
	}

	public void pattern_56(int width,int height)
	{
	    /*
			3 
			23 	
			123 
			0123 
			123 
			23 
			3
	 	*/
		int k=height/2;  
		for(int i=k;i>=-(k);i--)
		{
			for(int j=(k-common.abs(i));j>=0;j--)
			{
				System.out.print(k-j);
			}
			System.out.println(" ");
			//System.out.println((k)-(common.abs(i)));
		}
	}

	
}//end of class

