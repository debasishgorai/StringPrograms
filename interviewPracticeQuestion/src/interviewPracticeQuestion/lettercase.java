package interviewPracticeQuestion;

public class lettercase {
	
	    public static void main(String[] args) {
	        String input = "ran AAAh";
	        String output = changeCase(input);
	        System.out.println(output);  // Output: hELLO wORLD!
	    }

	    public static String changeCase(String str) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                result.append(Character.toLowerCase(ch));
	            } else if (Character.isLowerCase(ch)) {
	                result.append(Character.toUpperCase(ch));
	            } else {
	                result.append(ch);  // Non-alphabetic characters remain unchanged
	            }
	        }

	        return result.toString();
	    }
	}

