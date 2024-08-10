package String;

public class Occurence {
public static void main(String[] args) {
	String s ="raammh";
	String s1="";
	while(s.length()>0) {
		
		
		char c=s.charAt(0);
		int count=s.length()-s1.length();
		s1=s.replace(c+"", "");
		s=s1;
		System.out.println(c+"  "+count);
		
		
		
	}

}
}
