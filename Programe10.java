package classFile;
import java.util.Scanner;


public class Programe10{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER ANY STRING");
		String str = scan.nextLine();

		// output
		System.out.println("STRING INTO LOWERCASE:- "+ str.toLowerCase());
	}
}