

public class Datatype{
	public static void main(String args[]) {
		int a = 100.25;// remove the int in RHS and observe the error
		System.out.println("the value of a is " + a);
		float b= 100.46;//remove the f in the RHS and observe the error.
		System.out.printf("the valus of b is %f ",b);// change the f to .1f,.2f,.3f to display the decimal values.
		double c=100;
		System.out.println("\nthe value of c is "+c);
		long e=1;//remove L and observe the error and fix the data type by changing the type as long.
		System.out.println("the value of e is "+ e);
		int g= 'C';
		System.out.println("the value of g is " +g);//observe in the output it is printing the ASCII value of character C. If we want to print all the ascii values together can we use array.
// mathematical operation
	//h= a+b+c+e+g;// observe the error:unless u define the type of the variable compiler will not understand the variable.
	//int h= a+b+c+e+g;//observe the error:anyone component is double means overall result will be double( double is highest subset)
		double h= a+b+c+e+g;
	System.out.println("the value of h is "+h);
	
		
		
	}}
