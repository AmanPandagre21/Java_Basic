package classFile;
import java.util.Scanner;

public class Program33{

	public static void table(int m){
		for(int i=1; i<=10; i++){
			System.out.println(m+" X "+i+" = "+ m*i);
		}
	}

	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();

		table(num);	
	}
}