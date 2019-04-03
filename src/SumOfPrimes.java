import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {

		Scanner first=new Scanner(System.in);
		Scanner second= new Scanner(System.in);
		int a=first.nextInt();
		int b =second.nextInt();
		int sum=0;

		if(a<b)
			for(int i=a;i<=b;i++) {
				int count=0;
				for(int j=2;j<i;j++) {

					if(i%j==0)
						count++;
						
					
				}
				if(count==0)
					sum=sum+i;
				continue;


			}
		
		System.out.println(sum);





	}

}
