package interviewPracticeQuestion;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arraydupli {
	
	
	    public static void main(String[] args) {
	        int[] a1 = {5, 8, 9, 3, 6};
	        int[] a2 = {5, 6, 2, 1};

	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();

	        for (int i : a1) {
	            set1.add(i);
	        }
	        for (int i : a2) {
	            set2.add(i);
	        }

	        // Find common elements
	        List<Integer> commonElements = new ArrayList<>();
	        for (int i : a1) {
	            if (set2.contains(i)) {
	                commonElements.add(i);
	            }
	        }

	        // Find unique elements
	        List<Integer> uniqueElements = new ArrayList<>();
	        for (int i : a1) {
	            if (!set2.contains(i)) {
	                uniqueElements.add(i);
	            }
	        }
	        for (int i : a2) {
	            if (!set1.contains(i)) {
	                uniqueElements.add(i);
	            }
	        }

	        System.out.println("Output 1: " + commonElements);
	        System.out.println("Output 2: " + uniqueElements);
	    }
	}
