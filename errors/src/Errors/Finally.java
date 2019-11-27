package Errors;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try 
		{ 
			String sc=null;
			int a=sc.length();
			System.out.println(a);
			
		}
	catch(ArithmeticException e)
		{
			System.out.println(e+ " Check the number");
		}
		catch(NullPointerException e)
		{
			System.out.println(e+ " Check the program");
		}
		catch(Exception e)
		{
			System.out.println(e+ " something error in your programe");
		}


	}

}
