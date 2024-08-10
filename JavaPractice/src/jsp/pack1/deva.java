package jsp.pack1;

public class deva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s="ram is very busy";
	     // char[]a=s.toCharArray();
	     // String s1="";
	      //System.out.println(s);
	      for(int i=0;i<s.length();i++){
	          for(int j=i+1;j<s.length();j++){
	      
	      if(ispalindrome(s,i,j))
	    	  
	      System.out.println(s.substring(i, j+1));
	      }
	      }                 
	}

	private static boolean ispalindrome(String s, int start, int enf) {
		// TODO Auto-generated method stub
		int i=start;
		int j=enf;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
		}
		return true;
	   
	}//}
	      
}