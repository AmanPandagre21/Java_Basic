package classFile;
import java.util.Scanner;

public class Programe16{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("PLEASE ENTER NUMBER BETWEEN 1 TO 7");
		int num = scan.nextInt();

		switch(num){
			case 1: {	
				System.out.println("MONDAY");
				break;
			}
			case 2: {
				System.out.println("TUESDAY");
				break;
			}
			case 3: {
				System.out.println("WEDNESDAY");
				break;
			}
			case 4: {
				System.out.println("THURSDAY");
				break;
			}
			case 5: {
				System.out.println("FRIDAY");
				break;
			}
			case 6: {
				System.out.println("SATURDAY");
				break;
			}
			case 7: {
				System.out.println("SUNDAY");
				break;
			}
			default :{
				System.out.println("I TOLD YOU AT STARTING THAT ENTER NUMBER BETWEEN 1 TO 7 SO PLEASE FOLLOW THE INSTRUCTION");
			}
		}
	}
}