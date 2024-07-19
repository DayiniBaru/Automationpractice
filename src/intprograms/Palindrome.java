package intprograms;

public class Palindrome {

	public static void main(String[] args) {
		int i = 343, rev =0, rem ,  num;
		num= i;
		while(i!=0)
		{
			rem = i%10;
			rev= rev*10+rem;
			i=i/10;
			
			
		}
		if(num==rev)
		{
			System.out.println(num+ "Palidnrome number");
			
			
		}
		else
		{
			System.out.println(num + "not a palindrome");

		}
	}

}
