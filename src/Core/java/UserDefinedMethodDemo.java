package Core.java;

import java.util.Scanner;

public class UserDefinedMethodDemo {

		public String simplemessage(String name) {//user defined method1
			System.out.println("Hello " + name);
			return name;// what if we write here return type as void.Is it the output of the method will
			// not have any type?
			
			driver.

		}

		public int sumofnumbers(int first,int second) {//user defined method2
			int sum=first+second;
			System.out.println(sum);
			return sum;


		}



		public static void main(String[] args) {//main method
			while(true) {
				Scanner input= new Scanner(System.in);
				String name=input.nextLine();
				UserDefinedMethodDemo  a=new UserDefinedMethodDemo ();//here you have created an object of class Name:you can create an object of any class in the main method
				a.simplemessage(name);
				Scanner first=new Scanner(System.in);
				Scanner second=new Scanner(System.in);
				int b=first.nextInt();
				int c=second.nextInt();
				a.sumofnumbers(b, c);//calling the second method defined in Name class

			}

		}}
