package classFile;
import java.util.Scanner;

class Employee{
	private int salary = 0;
	private String name;

	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}

public class Program42{
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);

	System.out.println("ENTER YOUR GOOD NAME..");
	String name = scan.nextLine();

	System.out.println("ENTER YOUR SALARY");
	int salary = scan.nextInt();

	Employee obj = new Employee();

	obj.setSalary(salary);
	obj.setName(name);

	System.out.println("EMPLOYEE NAME IS :-"+ name);
	System.out.println("EMPLOYEE SALARY IS :-"+ salary);

	}
}