package Errors;

import java.util.Scanner;

public class Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try 
		{ 
			int a[]=new int[5];
			 a[6]= 30/2;
			
		}
	catch(ArithmeticException e)
		{
			System.out.println(e+ " Check the number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+ " Check the index");
		}
		catch(Exception e)
		{
			System.out.println(e+ " something error in your programe");
		}

	}

}
