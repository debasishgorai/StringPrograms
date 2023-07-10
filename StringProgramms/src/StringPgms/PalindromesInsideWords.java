package StringPgms;

public class PalindromesInsideWords {
	public static void main(String[] args) {
	String s1="malayalam";
	for(int i=0;i<s1.length();i++) {
		for(int j=i+1;j<s1.length();j++) {
			if(isPalindrome(s1,i,j))
				System.out.println(s1.substring(i,j+1));
		}
	}
	}
	
	static boolean isPalindrome(String s,int start,int end) {
		int i=start,j=end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}	
}
