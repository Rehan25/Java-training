package first1.java;

public class swapTwonumbers {

	public static void main(String[] args) {
		
		float first = 2.05f, second = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number - "+ first);
		System.out.println("Second number = " + second);
		
		//Value of the first is assigned to temporary.
		
		float temporary = first;
		
		//Value of second is assigned to first
		first = second;
		
		//Value of temporary (which contains the initial value of the first) is assigned to second
		second = temporary;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
	}

	}
