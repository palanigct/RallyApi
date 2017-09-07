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
		String winner="";
		
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
			
			winner=game.winner_2();
			if(winner=="Nill")
				condition=true;
			else
				condition=false;
		}
		
		//WINNING status : 
		System.out.println("\n\n      "+game.winner_2());
	}
		
	public String winner_2()
	{
		int dim=3;
		String winner="Nill";		
		int lastIndex=dim-1;	
		
		for(int i=0;i<dim;i++)
		{		
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
					
			for(int j=0;j<dim;j++)
			{
				if(box[i][0]==box[i][j]&&box[i][0]!='-') count1++;
				if(box[0][i]==box[j][i]&&box[0][i]!='-') count2++;
				if(box[0][0]==box[j][j]&&box[0][0]!='-') count3++;
				if(box[0][lastIndex]==box[j][lastIndex-j]&&box[0][lastIndex]!='-') count4++; 
			}
			
			if(count1==3)
			{
				if(box[i][0]=='x')
					 winner="PLAYER 1 WIN";
				else
					 winner="PLAYER 2 WIN";
				break;	
			}
			if(count2==3)
			{
				if(box[0][i]=='x')
					 winner="PLAYER 1 WIN";
				else
					 winner="PLAYER 2 WIN";
				break;			
			}
			if(count3==3)
			{
				if(box[0][0]=='x')
					 winner="PLAYER 1 WIN";
				else
					 winner="PLAYER 2 WIN";
				break;			
			}
			if(count4==3)
			{
				if(box[0][dim-1]=='x')
					 winner="PLAYER 1 WIN";
				else
					 winner="PLAYER 2 WIN";
				break;			
			}
		}
		
		
		return winner;
	}
	
    public String getInput()
	{
    	String input_str="";
    	boolean input_status=true;
    	int count=0;
    	while(input_status==true)
    	{
    		if(player1==true&&count==0)
    			System.out.println("\n Enter the Input (PLAYER 1):");
    		else if(player1==false&&count==0)
    			System.out.println("\n Enter the Input (PLAYER 2):");
    		else if(player1==true&&count!=0)    		
    			System.out.println("\n Enter the Correct Input (PLAYER 1):");
    		else if(player1==false&&count!=0)    		
    			System.out.println("\n Enter the Correct Input (PLAYER 2):");
    		
    		Scanner sc=new Scanner(System.in);
    		input_str=sc.next();		
    		
    		input_status=check_valid_input(input_str); 
    		//System.out.println("count : "+count);
    		count++;    		
    	}			
		
		return input_str;
	}
	
    public boolean check_valid_input(String input)
    {
    	boolean input_status = false;
    	char ch1 = input.charAt(0);
		char ch2 = input.charAt(1);
		int i=(int)ch2;
		int j=(int)ch1;
		i-=49;
		j-=65;
		if(box[i][j]=='-')
			input_status=false;
		else
			input_status=true;
		
    	return input_status;
    }
    
	public void fill_array_with_input(String str)
	{
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		int i=(int)ch2;
		int j=(int)ch1;
		i-=49;
		j-=65;
		//System.out.println(j+" "+i);
		
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
	
	
	//--------------------------Not Used--------------------------------------------------
	
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
	
	public String winner()
	{
		int dim=3;
		String winner="Nill";
		
		
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
				if(ch1=='x') winner="PLAYER 1 WIN";
				else 		 winner="PLAYER 2 WIN";
				break;
			}			
			
		}	
		
		
		return winner;
	}
	

}
