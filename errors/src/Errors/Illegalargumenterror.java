package Errors;

public class Illegalargumenterror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{ 
			Check obj=new Check();
			int a=5;
			int b=10;
			obj.dis(a,b);
			
		}
	catch(Exception e)
		{
			System.out.println(e+ " Check the number");
		}
	
	}

}
class Check{
	void dis(int a,String b){
		System.out.println("error");
	}
}
