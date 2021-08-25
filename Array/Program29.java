package classFile;
import java.util.Scanner;

public class Program29{
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

		System.out.println("ARRAY BEFORE REVERSING :- ");
		for(int i=0; i<num; i++){	
		 System.out.print("\t"+numArry[i]+"\t"); 	
		}

		try{
			System.out.println(" ");
			for(int i=0; i<(num/2); i++){	
				int c = numArry[i]; 
				numArry[i] = numArry[num-i-1];
				numArry[num-i-1] =c;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(num/2);
		}
		

		System.out.println("ARRAY AFTER REVERSING :- ");
		for(int i=0; i<num; i++){	
		 System.out.print("\t"+numArry[i]+"\t"); 	
		}
	}
}