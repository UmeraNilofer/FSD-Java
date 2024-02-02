package mypackage;

public class PracticeProject4 {

	int quantity;
	float price;
	String colour;

	void setLaptop(int quantity,float price,String colour) {
		this.quantity=quantity;
		this.price=price;
		this.colour=colour;
	}
	
	void display(String model) {
		String msg="Laptop Info";
		System.out.println(msg+":"+model);
		System.out.println("Quantity:"+ quantity);
		System.out.println("Price:"+ price);
		System.out.println("Colour:"+ colour);
	}

	public PracticeProject4() {			//Default Constructor
		System.out.println("object created...");
		this.quantity = 25;
		this.price = 63000;
		this.colour = "Black";
	}

	public PracticeProject4(int quantity, float price, String colour) {	//Parameterized Constructor
		super();
		System.out.println("object created...");
		this.quantity = quantity;
		this.price = price;
		this.colour = colour;
	}
	
    public static void main(String[] args) {
		
		PracticeProject4 c=new PracticeProject4();
		c.setLaptop(18, 56000, "grey");
		c.display("Dell");
		
		PracticeProject4 asus=new PracticeProject4();                 //Default Constructor
		asus.display("Asus");
		
		PracticeProject4 hp=new PracticeProject4(39, 72000,"blue");    //Parameter Constructor
		hp.display("HP");
	}
}
