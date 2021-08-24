package classFile;
import java.util.Scanner;

public class Program24{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();

		int sum = 0;

		for(int i=1; i<=num; i++){
			if(i%8==0){
				sum += i;
			}
		}

		System.out.println("SUM OF NO. MULTIPLE OF 8 BETWEEN "+num+" IS "+sum);
	}
}