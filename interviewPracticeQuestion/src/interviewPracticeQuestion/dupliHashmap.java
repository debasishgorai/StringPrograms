package interviewPracticeQuestion;

import java.util.HashMap;
import java.util.Map;

public class dupliHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramjukmmmjkmm";

Map<String,Character >m=new HashMap<>();
for(int i=1;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(s.charAt(i)==s.charAt(i-1)) {
		m.put(s,c);
		//break;
	}
}
System.out.println(m);
	}

}
