package classFile;
import java.util.Scanner;

public class Programe20{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();
		int i=1;
		int sum =0;
		while(i<=num){
			sum = sum+2*i;
			i++;
		}

		System.out.println("SUM OF FIRST N EVEN NUMBERS ARE:- "+ sum);
	}
}