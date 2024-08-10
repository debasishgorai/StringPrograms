package String;

public class PrintNonduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="radradfmmlop";
char []a=s.toCharArray();
for(int i=0;i<=a.length-1;i++) {
	boolean flag =true;
	for(int j=0;j<a.length;j++) {
		if(i!=j& a[i]==a[j]) {
			flag=false;
			break;
		}
	}
	if(flag) {
		System.out.println(a[i]);

		
	}
}
	}

}
