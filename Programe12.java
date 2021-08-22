package classFile;
import java.util.Scanner;


public class Programe12{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER YOUR GOOD NAME");
		String str = scan.nextLine();

		// given
		String letter = "Dear <|name|>, Thanks a lot..";

		// output
		String newLetter = letter.replace("<|name|>", str);
		System.out.println(newLetter);

	}
}