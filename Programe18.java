package classFile;
import java.util.Scanner;

public class Programe18{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("PLEASE ENTER YEAR");
		String web = scan.nextLine();

		if(web.endsWith(".com")){
			System.out.println("WEBSITE :- "+web + " \nA COMMERCIAL WEBSITE");
		}else if(web.endsWith(".org")){
			System.out.println("WEBSITE :- "+web + " \nA ORGANIZATION WEBSITE");
		}else if(web.endsWith(".in")){
			System.out.println("WEBSITE :- "+web + " \nA INDIAN WEBSITE");
		}else{
			System.out.println("WEBSITE :- "+web + " \nOTHER WEBSITE");
		}


	}
}