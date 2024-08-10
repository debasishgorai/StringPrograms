package interviewPracticeQuestion;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(num(1236));
	}

	 static int num(int num1) {
		// TODO Auto-generated method stub
		 if(num1==0) return 0;
		 else {
			 return (num1%10+ num(num1/10));
		 }
	}

}
