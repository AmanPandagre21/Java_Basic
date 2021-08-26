package classFile;
import java.util.Scanner;

public class Program38{

	public void avg(int ...array){
		int sum =0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}

		int len = array.length;
		float a = (float)sum/len;
		System.out.println("AVERAGE: -"+ a);
	}

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("ENTER THE INDEX NUMBER OF ARRAY:-");
			int n = scan.nextInt();

			int [] arry = new int[n]; 

		System.out.println("ENTER THE VALUES IN ARRAY:-");
			for (int i=0; i<n; i++) {
				arry[i] = scan.nextInt();			
			}

			Program38 obj = new Program38();

			obj.avg(arry);
		}
	}