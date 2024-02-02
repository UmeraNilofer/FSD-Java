import java.util.*;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String[] args) {
		
		System.out.println("Enter the email id: ");
		Scanner scan=new Scanner(System.in);
		String check=scan.next();
		String pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+_.-]+$";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find())
		System.out.println(check.substring(c.start(), c.end()));
		if(c.matches()) {
		System.out.println("The given email id is: Valid");
		}else {
		System.out.println("The given email id is: Invalid");
		}

	}

}
