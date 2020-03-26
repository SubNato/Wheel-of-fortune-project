import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		String [] Values = {"$850","Lose A Turn","$500","$700","$800","$650","$900","$2500","$ONE MILLION","$600","$550","$0"};
	
		try {
			
			
			int i=0;
			int index = (int) (Math.random() * Values.length);
			String temp = Values[i];
			Values[i] = Values[index];
			Values[index] = temp;
			
			
			System.out.println(Values[new Random().next(Values.length)]);
			
		} catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Error inr untime occurred");
			}
			
		}
		

	private int next(int length) {
		// TODO Auto-generated method stub
		return 0;
	}
}