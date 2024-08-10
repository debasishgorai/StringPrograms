package String;

public class uniqueLett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]s= {2,2,8,2};
for(int i=0;i<s.length-1;i++) {
	int count=0;
	for(int j=i+1;j<s.length;j++) {
		if(s[i]!=s[j]) {
			count++;
		}
	}
	if(count>=1) {
		System.out.println(s[i]);
	

}
	}

}}
