package testing;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1,val2,result;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the val for val1");
		val1 = obj.nextInt();
		System.out.println("Enter the val for val2");
		val2 = obj.nextInt();
		System.out.println("Choose your option \n 1. circle \t\t2. square\t\t3. Rect\t\t4. Tri");
		int choice = obj.nextInt();
		switch(choice) {
		case 1:
			result=3.14*val1*val1;
			System.out.println(result);
			break;
		case 2:
			result=val1-val2;
			System.out.println(result);
			break;
		case 3:
			result=val1*val2;
			System.out.println(result);
			break;
		case 4:
			result=val1/val2;
			System.out.println(result);
			break;	
		}
		
	}
}