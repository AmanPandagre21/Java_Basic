package classFile;
import java.util.Scanner;

public class Program27{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE INDEX OF ARRAY");
		int n = scan.nextInt();

		int [] marksArry = new int[n];

		System.out.println("ENTER THE MARKS IN ARRAY- ");
		for(int i=0; i<n; i++){	
		int arr = scan.nextInt();	
			marksArry[i] = arr;
		}

		int total =0;

		for(int i=0; i<n; i++){
			total += marksArry[i];
		}

		float avg = (float)total/n;

		System.out.println("AVERAGE MARKS OF STUDENT ARE:- "+ avg);
	}
}