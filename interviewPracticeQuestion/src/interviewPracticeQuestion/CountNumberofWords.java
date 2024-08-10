package interviewPracticeQuestion;

import java.util.Scanner;

public class CountNumberofWords {
public static void main(String[] args) {
	String s="ram is     best       hh        jjj";
	String[]a=s.trim().split("\\s+");
	int c=0;
	for(String n:a) {
		c++;
	}
	System.out.println(c);
}

}
