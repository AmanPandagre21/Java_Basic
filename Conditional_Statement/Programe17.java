package classFile;
import java.util.Scanner;

public class Programe17{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("PLEASE ENTER YEAR");
		int yr = scan.nextInt();

		if(yr%4 == 0){
			if(yr%100 == 0){
				if(yr%400 == 0){
					System.out.println("ENTERED YEAR IS LEAP YEAR");
				}else{
					System.out.println("ENTERED YEAR IS NOT A LEAP YEAR");
				}
			}else{
				System.out.println("ENTERED YEAR IS LEAP YEAR");
			}
		}else{
			System.out.println("ENTERED YEAR IS NOT A LEAP YEAR");
		}
	}
}