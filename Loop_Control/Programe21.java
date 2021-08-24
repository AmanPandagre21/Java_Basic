package classFile;
import java.util.Scanner;

public class Programe21{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER FOR MULTIPLICATION");
		int num = scan.nextInt();

		for(int i=1; i<=10; i++){
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}
}