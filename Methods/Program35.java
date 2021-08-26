package classFile;
import java.util.Scanner;

public class Program35{

	public int sum(int num){
		if(num == 1){
			return 1;
		}else{
			return num+sum(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER THE NATURAL NUMBER: -");
		int n = scan.nextInt();

		Program35 obj = new Program35();

		int s = obj.sum(n);

		System.out.println("SUM OF NATURAL NUMBER ARE :- "+ s);
	}
}