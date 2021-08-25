package classFile;
import java.util.Scanner;

public class Program25{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE NUMBER");
		int num = scan.nextInt();

		float [] numArry = new float[num];

		System.out.println("ENTER THE VALUES IN ARRAY- ");
		for(int i=0; i<num; i++){	
		float arr = scan.nextFloat();	
			numArry[i] = arr;
		}

		float sum =0f;
		for(int i=0; i<num; i++){		
			sum += numArry[i];
		}

		System.out.println("SUM OF ARRAYS VALUE: - "+ sum) ;
	}
}