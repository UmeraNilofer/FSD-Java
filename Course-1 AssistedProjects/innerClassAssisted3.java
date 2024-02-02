//anonymous inner class
abstract class AnonymousInnerClass{
	 abstract void display(); 
}
public class innerClassAssisted3 {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

	          void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	}

}
