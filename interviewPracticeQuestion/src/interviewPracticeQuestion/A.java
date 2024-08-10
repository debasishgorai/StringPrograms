package interviewPracticeQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {


public static void main(String[] args) {

	int[]a1= {12,8,6,6,6};
	boolean flag=false;
for(int i=1;i<=a1.length-1;i++) {
	if(a1[i]==a1[i-1]) {
		flag=true;
	}
	
	if(!flag) {
		System.out.println(a1[i-1]);
	}
}


}



}
