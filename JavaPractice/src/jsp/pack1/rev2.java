package jsp.pack1;

public class rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,5,7,8,9,2};
rev(a);
for(int n:a) {
	System.out.println(n);
}
//

	}

	private static void rev(int[] a) {
	int i;
	int j=a.length-1;

	for( i=2;i<j;i++) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		
		

}
	
		
	}

}
