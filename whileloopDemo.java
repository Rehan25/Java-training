package first1.java;
import java.util.Scanner;

public class whileloopDemo {

		// TODO Auto-generated method stub
			 public static void main(String[] args){
				 int number, sum = 0;
				 Scanner sc = new Scanner(System.in);
				 
				 System.out.println("n Please Enter any inter Value below 10: ");
				 number = sc.nextInt();
				 
				 while(number <= 10) {
					 sum = sum + number;
					 number++;
				 }
				 System.out.format("Sum of the Numbers From the While Loop is: %d", sum);
				 
					 
				 }
		 }
		
