package classFile;
import java.util.Scanner;

class Square{
private int side =0;
	public void setSide(int side){
		this.side = side;
	}

	public void area(){
		System.out.println("AREA OF SQUARE IS :- "+ side*side);
	}

	public void parameter(){
		System.out.println("PARAMETER OF SQUARE IS :- "+ 4*side);
	}                  
}

public class Program44{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER SIDE OF SQUARE: -");
		int side = scan.nextInt();

		Square obj = new Square();

		obj.setSide(side);
		obj.area();
		obj.parameter();
	}
}