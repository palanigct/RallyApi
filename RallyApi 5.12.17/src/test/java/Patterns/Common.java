package Patterns;

public class Common 
{

	public static Common common=new Common();
	public static int  number=0;
	
	public static Common getCommon() {
		return common;
	}

	public static void setCommon(Common common) {
		Common.common = common;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Common.number = number;
	}

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

    public void printNumWave(int i,int height,int lenth)
	{
    	int space_count=0;    
    	int center_space1=(i*2-2)*lenth;
    	int center_space2=((height*2)-(i*2)+2)*lenth;
    	
    	
    	int num= height-i+center_space1+center_space2+space_count+1;
    	
    	
		for(int j=1;j<=i*2;j++)
		{		
			String formatted_num1 = String.format("%02d", num);
	    	String formatted_num2 = String.format("%02d", num+space_count+1);
			
			if(j==1)
			   System.out.print(formatted_num1);
			else if(j==i*2)
				System.out.print(formatted_num2);
			else
			{
				System.out.print(" ");
				space_count++;
			}
				
		}
	}
    
    public void printCharWave(int i,int height,int lenth)
	{
    	int space_count=0;    
    	int center_space1=(i*2-2)*lenth;
    	int center_space2=((height*2)-(i*2)+2)*lenth;
    	
    	
    	int num= height-i+center_space1+center_space2+space_count+1;
    	
    	
		for(int j=1;j<=i*2;j++)
		{		
		    int ch1 = (num+64);
	    	int ch2 = (num+space_count+65);
	    	
	    	if(((ch1-65)/26)!=0)
	    	{
	    		int c=(ch1-65)/26;
	    		int change_val=26*c;
	    		ch1-=change_val;
	    	}
			
	    	if(((ch2-65)/26)!=0)
	    	{
	    		int c=(ch2-65)/26;
	    		int change_val=26*c;
	    		ch2-=change_val;
	    	}
	    	
	    	
			if(j==1)
			   System.out.print((char)ch1);
			else if(j==i*2)
				System.out.print((char)ch2);
			else
			{
				System.out.print(" ");
				space_count++;
			}
				
		}
	}
    
    
    //========================================================
    
    public void printSpace(int count)
    {
    	for(int i=0;i<count;i++)
    	{
    		System.out.print(" ");
    	}
    }
    
    public void printChar(char ch)
    {
    	System.out.print(ch);
    }
}
