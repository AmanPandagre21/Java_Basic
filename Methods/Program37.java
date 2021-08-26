package classFile;
import java.util.Scanner;

public class Program37{

	public void fibonacci(int fnum, int snum, int num){
		if(num==0){
			System.out.println("");
		}else{
			int temp=snum;
         snum=fnum+snum;
         fnum=temp;
         System.out.print(" "+ snum);
         fibonacci(fnum, snum, num-1); 
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER TO WHICH YOU WANT TO PRINT FIBONACCI SERIES: -");
		int n = scan.nextInt();

		Program37 obj = new Program37();
      System.out.print(" 0 1");
		obj.fibonacci(0,1,n-2);
	}
}