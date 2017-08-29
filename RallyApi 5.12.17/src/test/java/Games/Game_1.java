package Games;

import java.util.Scanner;

/*  1) 'x' and '0' game in 3x3 boxes  2) two player game 3) x,0 is the players input   */




public class Game_1 
{
	public static char box[][]=new char[100][100];
	public static Game_1 game=new  Game_1();
	public static Common  common = new Common();
	
	public boolean player1=true;
	
	public static void main(String arg[])
	{
		System.out.println("\n\n\t\tGame start");
		game.game();		
		System.out.println("\n\n\t\tGame End ");
	}
	
	public void game()
	{
		//disp_board();	
		int dim=3;
		fill_array(dim);
		disp_array(dim);
		boolean condition=true;
		int count=0;	
		
		while(condition==true&&count<9)
		{	
			
			String str = game.getInput();
			game.fill_array_with_input(str);
			disp_array(dim);
			
			count++;
			if(count%2==0)
				player1=true;
			else
				player1=false;
			
			System.out.println("Win status : "+game.win_player());
		}
	}
	
	public String win_player()
	{
		int dim=3;
		String win="Nill";
		
		
		for(int i=0;i<dim;i++)
		{
			int count=0;
			char ch1=' ';
			
			if(box[i][0]=='-') ch1=' ';
			else 			   ch1=box[i][0];	
			
			for(int j=0;j<dim;j++)
			{
				if(ch1!=box[i][j])				
					break;				
				else
					count++;
			}
			
			if(count==3)
			{
				if(ch1=='x') win="PLAYER 1 WIN";
				else 		 win="PLAYER 2 WIN";
				break;
			}			
			
		}	
		
		
		return win;
	}
	public String getInput()
	{
		if(player1==true)
			System.out.println("\n Enter the Input (PLAYER 1): \n\n");
		else
			System.out.println("\n Enter the Input (PLAYER 2): \n\n");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//char ch[]=str.toCharArray();
		
		return str;
	}
	
	public void fill_array_with_input(String str)
	{
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		int i=(int)ch2;
		int j=(int)ch1;
		i-=49;
		j-=65;
		System.out.println(j+" "+i);
		
		if(player1==true)
		{
			box[i][j]='x';
		}
		else
		{
			box[i][j]='0';
		}
		
	}
	
	public void fill_array(int dim)
	{
		for(int i=0;i<dim;i++)
		{
			for(int j=0;j<dim;j++)
			{
				box[i][j]='-';
			}			
		}
	}
	
	public void disp_array(int dim)
	{
		System.out.println("");
		System.out.print("\t");
		for(int h=0;h<dim;h++)
		{
			System.out.print("\t"+(char)(h+65));
		}
		System.out.println("");
		
		for(int i=0;i<dim;i++)
		{
			System.out.print("\t"+(i+1));
			for(int j=0;j<dim;j++)
			{
				
				System.out.print("\t"+box[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void disp_board()
	{
		print_box(3);
	}
	
	public void print_box(int num_box)
	{
		int height=3;
		int front_space=5;
		int center_space=5;
		int end_space=5;
		
		
		for(int i=0;i<height;i++)
		{
			common.printChar(' ',front_space);	
			
			if(i==0)
			{
				for(int j=0;j<=num_box;j++)
				{			
					common.printChar('-');	
					common.printChar('-',center_space);	
				}
			}
			else
			{
				for(int j=0;j<=num_box;j++)
				{			
					common.printChar('|');
					common.printChar(' ',center_space);				
				}
			}
			
			
			System.out.println("");			
		}
	}
	
}
