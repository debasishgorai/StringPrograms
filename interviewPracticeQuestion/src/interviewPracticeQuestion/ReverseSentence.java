package interviewPracticeQuestion;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ram is good";
String temp="";
char[]a1=s.toCharArray();
String[]a=s.split(" ");
for(int i=0;i<a.length;i++) {
	char c=s.charAt(i);
	temp=a[i]+" "+temp;
}
System.out.println(temp);
	}

}
