package first1.java;
import java.util.Scanner;

public class multiply_two_num {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for i..:");
		int i=scan.nextInt();
		
		System.out.println("Enter value for j...:");
		int j=scan.nextInt();
		int mul=i*j;
		System.out.println("The Multiplication of i and j is..:"+mul);
	}

}
