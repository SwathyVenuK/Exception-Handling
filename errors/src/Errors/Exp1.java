package Errors;

import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try 
		{
			int a=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
