import java.util.Scanner;

public class CricketScore{
	
	
	public static void main(String args[]) {
		int oversbowled;
		float currenrtrunrate;
		int targetrun;
		int totalovers;

		float avgrunrate;
		Scanner a= new Scanner(System.in);
		while(true) { 
		
		oversbowled=a.nextInt();
		currenrtrunrate=a.nextFloat();
		targetrun=a.nextInt();
		totalovers=a.nextInt();
		avgrunrate=(targetrun-currenrtrunrate*oversbowled)/(totalovers-oversbowled);
		System.out.printf("the required runrate is %.2f",avgrunrate); 
		if(oversbowled<0)
			break;
		
		}
		
		
		
	}}