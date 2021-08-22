package classFile;
import java.util.Scanner;

public class Programe13{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("ENTER YOUR GOOD NAME");
		String str = scan.nextLine();

		int dbl = 0;
		int strt = 0;
		
		for(int i=strt; i<str.length(); i++){
			if(str.indexOf("  ",strt) != -1){
				dbl++;
				strt = str.indexOf("  ",strt)+1;
			}else{
			break;
			}	
		}

		
		 strt = 0;
		 int trpl = 0;

		for(int i=strt; i<str.length(); i++){
			if(str.indexOf("   ",strt) != -1){
				trpl++;
				strt = str.indexOf("   ",strt)+1;
			}else{
				break;
			}	
		}

		
		dbl-=2*trpl;
		System.out.println("STRING CONTAIN "+ dbl +" DOUBLE AND "+ trpl+" TRIPLE SPACES");
	}
}