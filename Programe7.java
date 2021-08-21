package classFile;
import java.util.Scanner;

public class Programe7{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER YOUR GRADE");
		char grade = scan.next().charAt(0);

		// Output
		System.out.println("YOUR GRADE IN ENCRYPTED FORM:");
		System.out.println(grade += 8);

		System.out.println("YOUR GRADE IN DECRYPTED FORM:");
		System.out.println(grade -= 8);
	}
}