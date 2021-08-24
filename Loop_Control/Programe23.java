package classFile;
import java.util.Scanner;

public class Programe23{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();
		int i=1;
		int fact =1;
		while(i<=num){
			fact = fact*i;
			i++;
		}

		System.out.println("FACTORIAL OF GIVEN NUMBER IS:- "+ fact);
	}
}