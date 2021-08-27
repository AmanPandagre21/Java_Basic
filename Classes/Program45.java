package classFile;
import java.util.Scanner;

class Rectangle{
private int len =0;
private int bth =0;
	public void setSides(int len, int bth){
		this.len = len;
		this.bth = bth;
	}

	public void area(){
		System.out.println("AREA OF REACTANGLE IS :- "+ len*bth);
	}

	public void parameter(){
		System.out.println("PARAMETER OF REACTANGLE IS :- "+ 2*(len+bth));
	}                  
}

public class Program45{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER LENGTH OF REACTANGLE: -");
		int len = scan.nextInt();

		System.out.println("PLEASE ENTER BREADTH OF REACTANGLE: -");
		int bth = scan.nextInt();

		Rectangle obj = new Rectangle();

		obj.setSides(len,bth);
		obj.area();
		obj.parameter();
	}
}