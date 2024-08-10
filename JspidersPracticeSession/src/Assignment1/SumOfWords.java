package Assignment1;

public class SumOfWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i  am two";
char[] s1=s.toCharArray();
char temp=0;
//String temp=" ";
for(int i=0;i<=s1.length-1;i++) {
	// char a=s.charAt(i);
	 //if(a[i]=="") {
	 temp+=s1[i];
}//}
System.out.println(temp);

	}

}
