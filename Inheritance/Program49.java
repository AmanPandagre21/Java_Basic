package classFile;
import java.util.Scanner;

class Circle1 {
	private int rad =0;
	public void setRadius(int rad){
		this.rad = rad;
	}

	public int getRadius(){
		return rad;
	}
}

class Cylinder1 extends Circle1{
	private int height =0;

	public void setDimensions(int height, int radius){
		this.height =height;
		super.setRadius(radius);
	}

	public int getRadius1(){
		return super.getRadius();
	}

		public void area(){
			System.out.println("AREA OF CYLINDER1 IS :- "+ 2*Math.PI*super.getRadius()*this.height);
		}

		public void volume(){
			System.out.println("VOLUME OF CYLINDER1 IS :- "+ Math.PI*super.getRadius()*super.getRadius()*this.height);
		}       
}

public class Program49{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER RADIUS OF CYLINDER: -");
		int rad = scan.nextInt();

		System.out.println("PLEASE ENTER HEIGHT OF CYLINDER: -");
		int height = scan.nextInt();

		Cylinder1 obj = new Cylinder1();

		obj.setDimensions(height, rad);
		obj.area();
		obj.volume();
	}
}

