package StringPgms;

import java.util.Scanner;

public class CountString2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("enter name:");
         String s=sc.nextLine();
while(s.length()>0) {
	char c= s.charAt(0);
	String s1= s.replace(c+"", "");
	int count =s.length()-s1.length();
	System.out.println(c+"="+count);
	s=s1;
}
	}
}
