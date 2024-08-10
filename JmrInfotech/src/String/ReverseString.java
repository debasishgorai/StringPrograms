package String;

public class ReverseString {
public static void main(String[] args) {
	String s="rakkkkkm";
	String t="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		t+=ch;
	}
	System.out.println(t);
}
}
