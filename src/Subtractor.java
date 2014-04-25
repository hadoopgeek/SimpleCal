import java.util.Scanner;


public class Subtractor 
{
	Scanner sc = new Scanner(System.in);
	
	protected void finalize()
	{
		sc.close();
	}
	
	public void DoSubtraction()
	{
		System.out.println("Enter first Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second Number : ");
		int b = sc.nextInt();
		
		System.out.format("%d - %d = %d", a, b, a-b);
		
	}
}
