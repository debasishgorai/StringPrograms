package String;

public class nonduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramm";
char[]a=s.toCharArray();
int count=0;
for(int i=0;i<=a.length-1;i++) {
	boolean flag=true;
	for(int j=0;j<a.length;j++) {
		if(i==j)continue;
		else if
		(a[i]==a[j]) 
flag=false;
		}
	if(flag) {
		count++;
	}
	
		}
System.out.println(count);
}
	
}
