package test1;
import java.util.Scanner;
 public static int sum(int a, int b) {
	return a+b;
}

public class test1 {
		public static void main(String[]args){
			System.out.println("enter tow numbers ");
				Scanner input = new Scanner(System.in);
			int num1,num2;
			num1 = input.nextInt();
			num2 = input.nextInt();
			int result = sum(num1,num2);
			System.out.println("rsult is "+result);
			
			
			
		}
		

}
