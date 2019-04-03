package Core.java;

public class Arraydemo1 {

	public static void main(String[] args) {
	int originalArray[]= {89,33,45,67,12};
	int sum=0;
	for(int i=0;i<originalArray.length;i++) {
		System.out.println(originalArray[i]);
		
		sum= sum+originalArray[i];
		if(sum>200)
			break;
		
	}
	System.out.println(sum);
	

	}}
