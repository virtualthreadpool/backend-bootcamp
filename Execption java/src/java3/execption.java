package java3;

public class execption {
	public static void main(String[] args){
		System.out.println("progrem execution start");
		int fnumber=6;
		int snumber=0; 
		try {
		int  result =fnumber/snumber;
		System.out.println("output is:"+result);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception: "+ e.getMessage());
		}
		System.out.println("program execution end");
		
		
	}

}
