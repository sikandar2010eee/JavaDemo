package Core.java;

import java.util.Scanner;

public class Arraydemo2 {
	
	//Arrays using scanner...........
	/*Displaying using special for loop
	for(write any variable name:write name of the array)
	print any variable
*/
	public static void main(String[] args) {
		int data[]= new int[5];//allocating array of size 5 ....
		int len=data.length;//storing length of the array in the variable.
		Scanner input = new Scanner(System.in);
		int sum=0;
		System.out.println("Please input "+len+" value one by one");
		for(int i=0;i<len;i++) {
			data[i]= input.nextInt();//storing the inputtted values in the array already allocate with null values.
			sum= sum+data[i];//adding all the elements of the array.
			//System.out.println(data[i]);
			
		}
		
		System.out.println(sum);
for (int x:data) {
	//printing contents of the array.....
	System.out.println(x);
}
	}

}
