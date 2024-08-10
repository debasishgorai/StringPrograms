package Assignment1;

import java.util.Scanner;

public class SpacesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter name");
      String d=sc.nextLine();
      d=d.trim();
      int count=0;
	
      String k="";
      for(int i=0;i<d.length();i++) {
    	  char a=d.charAt(i);
      if(a!=' ') {
    	  count=0;
    	  k+=a;
      }
      else if(a==' '){
    	  count++;
    	  if(count==1) {
    		  k+=a;
    	  }
      }}
     System.out.println(k); 
	}

}
