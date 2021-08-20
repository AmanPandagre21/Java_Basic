package classFile;
import java.util.Scanner;

public class Programe2{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER THE MARKS");
		int m1 = scan.nextInt();

		System.out.println("ENTER THE MARKS");
		int m2 = scan.nextInt();

		System.out.println("ENTER THE MARKS");
		int m3 = scan.nextInt();

		// claculating CGPA
		float cgpa =(m1+m2+m3)/300f*10 ;

		// Output
		System.out.println("CGPA  :- " + cgpa);

	}
}