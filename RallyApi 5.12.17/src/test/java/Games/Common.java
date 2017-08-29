package Games;

public class Common 
{

	public static Common  common = new Common();
	
	public void printSpace(int count)
	{
		for(int i=0;i<count;i++)
		System.out.print(i);
	}
	
	public void printChar(char ch)
	{
		System.out.print(ch);
	}
	public void printChar(char ch,int count)
	{
		for(int i=0;i<count;i++)
		System.out.print(ch);
	}
}
