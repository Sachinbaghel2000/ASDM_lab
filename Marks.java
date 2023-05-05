import java.util.Scanner;

public class Marks {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your Graduation Percentage");
		int n = s.nextInt();
		
		if(n>=80 && n<=100)
		{
			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("You are not eligible");
		}
		System.out.println("Enter your marks in Math");
		int maths = s.nextInt();
		System.out.println("Enter your marks in Physics");
		int phy = s.nextInt();
		
		if(maths>=80 && maths<=100)
		{
			if(phy>=80 && phy<=100)
			{
				System.out.println("You are eligible for the course");
			}
		}
		else
		{
			System.out.println("You are not eligible");
		}
		

	}

}
