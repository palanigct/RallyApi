package Patterns;

public class Common 
{

	public static Common common=new Common();
	
	public int abs(int num)
	{
		int ans=0;
		if(num<0)
			ans=-(num);
		else 
			ans=num;
		
		return ans;
	}

	public void printStar3(int i)
	{
		for(int j=0;j<=i*2;j++)
		{		
			System.out.print("*");
		}
	}
	
	public void printStar2(int i)
	{
		for(int j=0;j<=i;j++)
		{		
			System.out.print("* ");
		}
	}
	
	public void printSpaceCenter(int i,int k)
	{
		for(int s=0;s<(k*2-2)-(i*2);s++)
		{
			System.out.print(" ");
		}
	}
	
	public void printSpaceEdge(int i,int k)
	{
		for(int s=0;s<(k-i);s++)
		{
			System.out.print(" ");
		}
	}

    public void printPyramid_1(int height,int count,int pos)
    {
    	int k=height;
		for(int i=0;i<k;i++)
		{				
			common.printSpaceEdge(i, k+pos);
			
			for(int j=0;j<count;j++)
			{
				common.printStar3(i);			
				common.printSpaceCenter(i, k);
			}
					
			System.out.println("");
		}
    }
	
    public void printPyramid_2(int height,int count,int pos)
    {
    	int k=height;
		for(int i=0;i<k;i++)
		{				
			common.printSpaceEdge(i, k+pos);
			
			for(int j=0;j<count;j++)
			{
				common.printStar2(i);			
				common.printSpaceCenter(i, k);
			}
					
			System.out.println("");
		}
    }
	
    //====================================================
    
    public void printSpaceC(int i,int height)
	{
    	int k=height;    	
    	
		for(int s=0;s<((k*2)-(i*2));s++)
		{
			System.out.print(" ");
		}
	}
	
  

    
    
	public void printSpaceE(int i,int height)
	{
		int k=height;
		for(int s=0;s<(k-i);s++)
		{
			System.out.print(" ");
		}
	}

    
    public void printChar(int i,char ch1,char ch2)
	{
		for(int j=1;j<=i*2;j++)
		{		
			if(j==1)
			   System.out.print(ch1);
			else if(j==i*2)
				System.out.print(ch2);
			else				
				System.out.print(" ");
		}
	}


}
