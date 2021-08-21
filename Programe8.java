package classFile;
import java.util.Scanner;

public class Programe8{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// given number
		int n = 19;

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();

		// Output
		if(num > n){
			System.out.println("USER NUMBER IS GREATER THEN THE GIVEN NUMBER ");
		}else if(num == n){
			System.out.println("USER NUMBER IS EQUAL TO THE GIVEN NUMBER:");
		}else{
			System.out.println("USER NUMBER IS SMALLER THEN THE GIVEN NUMBER:");
		}
	}
}