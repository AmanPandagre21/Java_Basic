package classFile;
import java.util.Scanner;


public class Program28{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		int [][] arry1 = new int[2][3];
		int [][] arry2 = new int[2][3];

		
		for(int i=0; i<2; i++){	
			for (int j=0; j<3; j++){
			System.out.print("ENTER THE ("+i+", "+j+") VALUE OF A MATRIX :- ");
			arry1[i][j] = scan.nextInt();
			}
		}
		System.out.println(" ");

		for(int i=0; i<2; i++){	
			for (int j=0; j<3; j++){
			System.out.print("ENTER THE ("+i+", "+j+") VALUE OF B MATRIX :- ");
			arry2[i][j] = scan.nextInt();	
			}
		}

		int [][] sum = new int[2][3];
		for(int i=0; i<2; i++){	
			for (int j=0; j<3; j++){
				sum[i][j] = arry1[i][j] +arry2[i][j];
			}
		}

		System.out.println("SUM OF MATRICES ARE :- ");
		for(int i=0; i<2; i++){	
			for (int j=0; j<3; j++){
				System.out.print("\t"+sum[i][j]+"\t");
			}
			System.out.println(" ");
		}

	}
}