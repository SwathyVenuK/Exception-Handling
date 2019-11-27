package Errors;

import java.util.Scanner;

public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try 
		{
			int arr[]= {1,3,5,7};
			System.out.println(arr[10]);
		}
	catch(ArithmeticException e)
		{
			System.out.println(e+"Check the index");
		}

	}

}
