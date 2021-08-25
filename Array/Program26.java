package classFile;
import java.util.Scanner;

public class Program26{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE INDEX OF ARRAY");
		int n = scan.nextInt();

		System.out.println("ENTER THE NUMBER TO FIND IN ARRAY");
		int findNum = scan.nextInt();


		int [] numsArry = new int[n];

		System.out.println("ENTER THE VALUES IN ARRAY- ");
		for(int i=0; i<n; i++){	
		int arr = scan.nextInt();	
			numsArry[i] = arr;
		}

		Boolean check = false;

		for(int i=0; i<n; i++){
			if(findNum==numsArry[i]){
				System.out.println("NUMBER FIND AT THIS "+i+" INDEX NUMBER");
				check = true;
				break;
			}
		}

		if(check){

		}else{
			System.out.println("NUMBER NOT PRESENT IN ARRAY");
		}
	}
}