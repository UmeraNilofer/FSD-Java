
public class overloadMethod {

	public void area(int b,int h)			//method overloading
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		
		overloadMethod od=new overloadMethod();
	       od.area(10,12);
	       od.area(5);  
	}

}
