package classFile;
import java.util.Scanner;

public class Programe3{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER YOUR GOOD NAME...");
		String name = scan.nextLine();

		// Output
		System.out.println("HELLO MR." + name.toUpperCase() + " HAVE A GOOD DAY");

	}
}