package classFile;
import java.util.Scanner;
import java.lang.Math;

class Cylinder{
	private int radius = 0;
	private int height = 0;

	public Cylinder(int radius, int height){
		this.radius = radius;
		this.height = height;
	}

		public void area(){
			System.out.println("AREA OF CYLINDER IS :- "+ 2*Math.PI*radius*height);
		}

		public void volume(){
			System.out.println("VOLUME OF CYLINDER IS :- "+ Math.PI*radius*radius*height);
		}                 
}

public class Program47{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER RADIUS OF CYLINDER: -");
		int rad = scan.nextInt();

		System.out.println("PLEASE ENTER HEIGHT OF CYLINDER: -");
		int height = scan.nextInt();

		Cylinder obj = new Cylinder(rad, height);

		obj.area();
		obj.volume();
	}
}