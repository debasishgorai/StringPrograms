package interviewPracticeQuestion;

public class countalphnumspecialch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ram8888@#%yyyy999#";
int countalp=0;
int special=0;
int num=0;
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(Character.isAlphabetic(c)) {
		countalp++;
	}
	else if(Character.isDigit(c)) {
		num++;
	}
	else if(!Character.isLetterOrDigit(c)) {
		special++;
	}
}
System.out.println(countalp+" "+special+" "+num);
	}

}
