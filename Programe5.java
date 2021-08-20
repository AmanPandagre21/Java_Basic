package classFile;
import java.util.Scanner;

public class Programe5{
	public static void main(String [] args){
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER ANY THING");
		Boolean val = scan.hasNextInt();

		// Output
		if(val){
			System.out.println("ENTER NUMBER IS AN INTEGER");
		}else{
			System.out.println("ENTER NUMBER IS NOT AN INTEGER");
		}
	}
}