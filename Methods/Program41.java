package classFile;
import java.util.Scanner;

public class Program41{

	public static void celToFah(float cel){
		float fahrenhite = 0f;
		fahrenhite = cel*9/5f +32f;
		System.out.println("CELSIUS TO FAHRENHITE");
		System.out.println(cel + "\u00B0C = "+ fahrenhite + "\u00B0F");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("PLEASE ENTER THE CELSIUS VALUE:-");
		float ce = scan.nextFloat();

		celToFah(ce);
	}
}