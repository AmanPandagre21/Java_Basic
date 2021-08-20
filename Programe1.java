package classFile;
import java.util.Scanner;

public class Programe1{
	public static void main(String args[]){

		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE FIRST NUMBER");
		int num1 = scan.nextInt();

		System.out.println("ENTER THE SECOND NUMBER");
		int num2 = scan.nextInt();

		System.out.println("ENTER THE THIRD NUMBER");
		int num3 = scan.nextInt();

		// adding all the numbers
		int sum = num1+num2+num3;

		// Output

		System.out.println("THE SUM OF THREE NUMBERS ARE :- " + sum);
	}
}