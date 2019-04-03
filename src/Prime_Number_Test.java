import java.util.Scanner;

public class Prime_Number_Test {


	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		int count=0;
		for(int i=2;i<b;i++)
		{

			if(b%i==0)
				count++;
		}
		if(count==0) {
			System.out.println(count);
			System.out.println("the number is primes");
		}
		else {
			System.out.println("the number is not prime");
			System.out.println(count+2);
		}




	}
}
