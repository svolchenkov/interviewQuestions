package palindromeOrNot;

public class PalindromeOrNot {
	
	public PalindromeOrNot(String str) {
		super();
		check(str);
	}
	
	public void check(String str) {
		StringBuilder builder = new StringBuilder(str);
		String retVal = (str.equals(builder.reverse().toString()) ? "polondrome is !" : "is not polindrome");
		System.out.println(retVal); 
	}
	
}
