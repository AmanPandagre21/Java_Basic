package classFile;
import java.util.Scanner;
import java.lang.Math;

class Circle{

private int rad =0;

	public void setRadius(int rad){
		this.rad = rad;
	}

	public void area(){
		System.out.println("AREA OF CIRCLE IS :- "+ Math.PI*rad*rad);
	}

	public void circumference(){
		System.out.println("CIRCUMFERENCE OF REACTANGLE IS :- "+ 2*Math.PI*rad);
	}                  
}

public class Program46{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER RADIUS OF CIRCLE: -");
		int rad = scan.nextInt();

		Circle obj = new Circle();

		obj.setRadius(rad);
		obj.area();
		obj.circumference();
	}
}