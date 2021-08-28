package classFile;
import java.util.Scanner;

class Rectangle1{
private int len =4;
private int bth =5;
	public Rectangle1(){
		System.out.println("LENGTH OF RECTANGLE IS :-"+ this.len);
		System.out.println("BREADTH OF RECTANGLE IS :-"+ this.bth);
	}   

	public Rectangle1(int len, int bth){
		System.out.println("LENGTH OF RECTANGLE IS :-"+ len);
		System.out.println("BREADTH OF RECTANGLE IS :-"+ bth);
	}     
}

public class Program48{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER LENGTH OF REACTANGLE: -");
		int len = scan.nextInt();

		System.out.println("PLEASE ENTER BREADTH OF REACTANGLE: -");
		int bth = scan.nextInt();

		// Rectangle1 obj = new Rectangle1();

		Rectangle1 obj1 = new Rectangle1(len, bth);
	}
}