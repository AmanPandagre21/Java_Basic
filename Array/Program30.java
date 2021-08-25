package classFile;
import java.util.Scanner;

public class Program30{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE INDEX OF ARRAY");
		int num = scan.nextInt();

		int [] numArry = new int[num];

		System.out.println("ENTER THE VALUES IN ARRAY- ");
		for(int i=0; i<num; i++){	
		numArry[i] = scan.nextInt();	
		}

		int max =0;
		
		for(int i=0; i<num; i++){
			if(max<=numArry[i]){
				max = numArry[i];
			}	
		}

		System.out.println("MAXIMUM NUMBER OF ARRAY :- " + max);
	}
}