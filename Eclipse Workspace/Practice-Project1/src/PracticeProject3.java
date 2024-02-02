
public class PracticeProject3 {

	public static void main(String[] args) {
		nocall();
		minus(22,35);
		String res= value("Rosy!") ;
		System.out.println("Hey, "+res);
	}
		
		//no passing parameters and no return type
		 static void nocall() {
			System.out.println("No parameter passing and No return type");

	}

		//passing parameters and no return type
		 static void minus(int x,int y) {
			 int sub=x-y;
			System.out.println("Subtraction of x and y:"+sub);
		 }
		 
		 //passing parameters and return type
		 static String value(String name) {
			 return "Hello "+name;
		 }
}
