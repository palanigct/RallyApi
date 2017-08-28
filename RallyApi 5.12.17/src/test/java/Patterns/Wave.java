package Patterns;

public class Wave 
{
	public static Wave wave=new Wave();
	public static Common common=new Common();
	public static void main(String arg[])
	{
		int height=4;
		int width=5;
		
		wave.wave_1(width, height);
	}
	
	public void wave_1(int width,int height)
	{
		int noc=3;
		for(int i=1;i<=height;i++ )
		{
					
			common.printSpaceE(i, height);
			
			for(int j=0;j<3;j++)
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

}
