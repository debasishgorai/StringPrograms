package StringPgms;

public class InitCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i am debasish";
char []a=s.toCharArray();
int i=0;
while(i<a.length) {
	   if(i==0) {
		   ctu(a,0);
		   i++;
	   }

while(i<a.length && a[i]!=' ') 
	   i++;
if(i<a.length-1)ctu(a,i+1);
i++;

}
String s1= new String(a);
System.out.println(s1);
	}

	private static void ctu(char[] a, int i) {
		// TODO Auto-generated method stub
		if(a[i]>='a' && a[i]<='z') {
			a[i]-=32;
		}
	}

}
