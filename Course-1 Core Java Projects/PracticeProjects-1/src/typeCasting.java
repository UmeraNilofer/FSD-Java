
public class typeCasting {

	public static void main(String[] args) {
		// TypeCasting
				System.out.println("Implicit TypeCasting");
				byte a=12;			//implicit
				short b=a;
				System.out.println("Value of a: "+a);
				System.out.println("Value of b: "+b);
						
				int m=34;   		//implicit
				float n=m;
				System.out.println("Value of m: "+m);
				System.out.println("Value of n: "+n);
						
				int i=112;	         //implicit
				String j=i+"";
				System.out.println("Value of i: "+i);
				System.out.println("Value of j: "+j);
						
				System.out.println("\nExplicit TypeCasting");
				short c='r';		  //explicit
				char d=(char)c;
				System.out.println("Value of c: "+c);
				System.out.println("Value of d: "+d);
						
				float p=(float)456.0; //explicit
				int q=(int)p;
				System.out.println("Value of p: "+p);
				System.out.println("Value of q: "+q);
						
				String u="686";		//explicit
				int v=Integer.valueOf(u);
				System.out.println("Value of u: "+u);
				System.out.println("Value of v: "+v);

	}
}
