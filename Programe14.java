package classFile;
import java.util.Scanner;

public class Programe14{
	public static void main(String args[]){

		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("PLEASE ENTER YOUR HINDI MARKS");
		int m1 = scan.nextInt();

		System.out.println("PLEASE ENTER YOUR ENGLISH MARKS");
		int m2 = scan.nextInt();

		System.out.println("PLEASE ENTER YOUR MARKS NUMBER");
		int m3 = scan.nextInt();

		// adding all the numbers
		int sum = m1+m2+m3;

		float percentage = sum/3f;

		// Output
		if(percentage < 40 || m1 < 33 || m2<33 || m3 < 33){
			System.out.println("STUDENT FAIL WITH " + percentage+ " %");
		}else{
			
			System.out.println("STUDENT PASS WITH " + percentage+ " %");
		}
		
	}
}