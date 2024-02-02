import java.util.*;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first value:");
		float n1=scan.nextFloat();
		System.out.println("Enter the second value:");
		float n2=scan.nextFloat();
		System.out.println("Select the Operation\n+ - * / %");
		String op;
		op=scan.next();
		float res=Operation(n1,n2,op);
		System.out.println("The Result is:"+res);
	}
		
		public static float Operation(float n1,float n2,String op) {
		float res=0;
		
		switch(op) {
			case "+":
				res=n1+n2;
				break;
			case "-":
				res=n1-n2;
				break;
			case "*":
				res=n1*n2;
				break;
			case "/":
				res=n1/n2;
				break;
			case "%":
				res=n1%n2;
				break;
			default :
				System.out.println("Invalid Operation");
				break;
		}
		return res;
	}

}
