package StringPgms;

public class ReverseEachWords2 {
	public static void main(String[] args) {
		String s= "java is  easy";
		char[]a=s.toCharArray();
		String s1="";
		int i=a.length-1;
		int j=a.length-1;
		while(i>=0) {
			while(i>=0 && a[i]!=' ')
				i--;
			
			int k=i+1;
			String t="";
			while(k<=j) {
				
				t+=a[k];
				k++;
					
			}
			s1+=t;
			if(i>=0)
				s1+="";
			i--;
			j=i;
		}
		System.out.println(s1);
	
		
	}
}
