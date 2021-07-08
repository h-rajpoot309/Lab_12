package test;
import java.util.Scanner;


public class test {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int multi(int a, int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n1,n2;
		int result= 0;
		System.out.println("enter two numbers");
		n1 = input.nextInt();
		n2 = input.nextInt();		
		char sym;
		System.out.println("enter the operation");
		sym =  input.next().charAt(0);
		switch(sym) {
		case '+':
			result = sum(n1,n2);
			System.out.println("operation result is "+result);
			break;
		case'-':
			result =sub(n1,n2);
			System.out.println("operation rsult  is "+result);
			break;
		case '*':
			result= multi(n1,n2);
			System.out.println("operation result  is *"+result);
			break;
		case '/':
			result = div(n1,n2);
			System.out.println("result is "+result);
			break;
		}

}

	}
