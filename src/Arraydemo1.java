public class Arraydemo1{
	public static void main(String args[]) {
		
		
		int a[]= {11,16,9,1,19,91};
		int sum=0;
		int big=a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]<big) {
			big=a[i];
		}
		}
		System.out.println(big); 
		
		
		
	
	}}