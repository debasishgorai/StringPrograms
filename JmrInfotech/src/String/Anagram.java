package String;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(anagram("listen","sillsent"));
	}

	private static boolean anagram(String s1, String s2) {
		
		while(true) {
			if(s1.length()==0&&s2.length()==0) return true;
			if(s1.length()!=s2.length()
					)return false;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
		}
		
		
		
		
	
		
	}

}
