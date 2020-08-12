package project1;

public class Myclass {

	public static void main(String[] args) {
		
		try{
			int[] myNumbers = {20, 72, 73};
	    System.out.println(myNumbers[15 ]); 

	}
		catch(Exception e)
		{
			System.out.println("something is wrong");
			
		}
       finally
       {
	System.out.println("try and catch done");
	}
}
}

