import java.util.Scanner;
//printing the consecutive sum as well as total sum

public class Sumofnumbers{
	private int alpha;
	private int beta;
	private int gama;
	
	public Sumofnumbers(int alpha, int beta, int gama) {
		super();
		this.alpha = alpha;
		this.beta = beta;
		this.gama = gama;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String args[]) {
		
		Scanner a= new Scanner(System.in);
		a.close();
			
		int sum=0;
		int num=0;
		while (true) {
			num=a.nextInt();
			sum=sum+num;
			System.out.println(sum);
			if(num<0)
				continue;//write break in place of break and uncomment the below print statement and observe the results.
		}
		//System.out.println(sum);
		
				}}