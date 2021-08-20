package classFile;
import java.util.Scanner;

public class Programe4{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER KILOMETERS");
		float km = scan.nextFloat();

		// converting into miles
		float mile = km*0.621f ;

		// Output
		System.out.println(km+" km = "+ mile+ " miles");

	}
}