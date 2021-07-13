package first1.java;
import java.util.Scanner;
public class Main {
	public class PyramidExampleReverse {
	public class PyramidExamples {
    public class Floyd Triangle{
}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			System.out.println("* ");
		}
		System.out.println();//New line
	}
}
//public class PyramidExampleReverse {
	//public static void main(String[] args){
		int term=6;
		for(int i=1;i<=term;i++)
		{
			for(int j=term;j>=1;j--)
			{
				System.out.println("* ");
				
			}
			System.out.println();//new line
		}
	}
	//Floyd Triangle

	
	class FloydsTriangle
	{
		//public static void main(String args[])
		{
			int rows, number = 1, counter, j;
			//To get the user's input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of rows for floyd's triangle:");
			//copying user input into an integer variale named rows
			rows = input.nextInt();
			System.out.println("Floyd's triangle");
			System.out.println("****************");
			for ( counter = 1 ; counter <= rows ; counter++ )
			{
			for ( j = 1 ; j <= counter ; j++ )
			{
			System.out.print(number+" ");
			//Incrementing the number value
			number++;
			}
			//For new line
			System.out.println();
			}
			}
		}
	}