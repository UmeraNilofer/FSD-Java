
public class oopsConcepts {

	public static void main(String[] args) {
			Scooter b=new Scooter();
			b.display();
			Scooty s=new Scooty();
			s.display();
			System.out.println(s.sum(4,5));
			System.out.println(s.sum(4.5,6.5));			//polymorphism
			Honda h = new Honda();		
			h.speed();  
			h.color();	
			h.milage();
			Model m=new Model();
			m.setName("Pulsar");
			m.dis();
		}
	}
		class Scooter{
			public void display() {
				System.out.println("Scooter is running....");
			}
		}
		
		class Scooty extends Scooter {					//inheritance
			@Override
			public void display() {
				System.out.println("Scooty is running....");
			}

		public int sum(int x,int y) {
			return x+y;
		}
		
		public double sum(double x,double y) {			//overload
			return x+y;
		}
		}
		
		abstract class Bike {							//abstraction
			abstract void speed();
			void milage() {
				System.out.println("Bike Milage is 55kmpl");
			}
		}
		class Honda extends Bike {			
			void color() {
				System.out.println("Black");
			}
			@Override
			void speed() {								// override 
				System.out.println("Honda Speed is 50kmph");
			}
		}

		class Model{									//encapsulation
			private String name;
		
			public void setName(String name){
				this.name=name;
			}
			void dis() {
				System.out.println("Model name is:"+name);	
	}

}
