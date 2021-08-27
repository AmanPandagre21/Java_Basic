package classFile;

class Cellphone{
	public void ring(){
		System.out.println("RINGING.......");
	}

	public void vibrate(){
		System.out.println("VIBRATING......");
	}
}

public class Program43{
	public static void main(String[] args) {
		Cellphone obj = new Cellphone();

		obj.ring();
		obj.vibrate();
	}
}