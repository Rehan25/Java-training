package first1.java;
import java.util.Scanner;

public class FindAreaOfRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width = scanner.nextDouble();
		//Area = length*width;
		double area = length*width;
		System.out.println("Area of Rectangle is:"+area);
	}

}
