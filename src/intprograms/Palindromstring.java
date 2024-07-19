package intprograms;

public class Palindromstring {

	public static void main(String[] args) {
	   String str = "Aba", revString = "";
	   int StrLength = str.length();
	   
	   for(int i=StrLength-1; i>=0; --i)
	   {
		   revString = revString+ str.charAt(i);
	   }
		   if(str.toLowerCase().equals(revString.toLowerCase()))
		   {
			   System.out.println(str + "is a palindrome");
		   }
		   else
		   {
			   System.out.println("not a palindrome");
		   }
	   

	}

}
