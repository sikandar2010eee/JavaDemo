package Core.java;

public class Printdigitusingstring {

	public void printdigits(int a) {
		
		String b=Integer.toString(a);
		for(int i=0;i<b.length();i++) {
			System.out.println(b.charAt(i));
		}
			 
		
	}

	public static void main(String[] args) {
		Printdigitusingstring digits= new Printdigitusingstring();
		digits.printdigits(13245);
		

	}

}
