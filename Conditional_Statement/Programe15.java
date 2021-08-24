package classFile;
import java.util.Scanner;

public class Programe15{
	public static void main(String[] args) {
		// making object of scanner class
		Scanner scan = new Scanner(System.in);

		// takin user inputs
		System.out.println("PLEASE ENTER YOUR INCOME");
		int income = scan.nextInt();

		// given
		float tax = 0f;

		if(income < 250000 ){
			System.out.println("NO TAX");
		}else if(income >=250000 && income<=500000){
			tax = income/100*5f;
			System.out.println("YOUR TAX IS :- " + tax);
		}else if(income >=500000 && income<=1000000){
			 tax = income/100*20f;
			System.out.println("YOUR TAX IS :- " + tax);
		}else if(income >=100000){
			 tax = income/100*30f;
			System.out.println("YOUR TAX IS :- " + tax);
		}else{
			System.out.println("PLEASE ENTER VALID INCOME");
		}
	}
}