package classFile;
import java.util.Scanner;

public class Program32{
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

		Boolean check = false;
		for(int i=0; i<num-1; i++){
			if(numArry[i] >= numArry[i+1]){
				check = true;
				break;
			}
		}
		if(check){
			System.out.println("ARRAY IS NOT SORTED  :- ");
		}else{
			System.out.println("ARRAY IS SORTED:- ");
		}
		

	}
}