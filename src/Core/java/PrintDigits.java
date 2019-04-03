package Core.java;

public class PrintDigits {
	
	public void printdigits(int a) {
		int b=a/10;// it will give unit place digits
		System.out.print(b);
		int c=a/10;
		int d=c%10;
		int e=a/100;
		System.out.print(d);
		System.out.print(e);
	 
		
	}

	public static void main(String[] args) {
		PrintDigits digits= new PrintDigits();
		digits.printdigits(10);
		

	}

}
