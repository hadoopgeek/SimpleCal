import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Option");
		System.out.println("1 Add");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
			
		switch(input)
		{
			case 1:
				  Adder add = new Adder();
				  add.DoAdd();
				  break;
			
		}
			
			
			
		sc.close();
	}
}
