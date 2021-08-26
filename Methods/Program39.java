package classFile;
import java.util.Scanner;

public class Program39{
	static int i=1;
	public static void recursive_pattern(int n){
		if(n==0){
			System.out.print(" ");
		}else{
			
		if(i<=n){
			System.out.print("*");
			++i;
			recursive_pattern(n);			
		}else{
			System.out.println("");
			i=1;
			recursive_pattern(n-1);
		}
		
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER: -");
		int n = scan.nextInt();

		recursive_pattern(n);
			
	}
}